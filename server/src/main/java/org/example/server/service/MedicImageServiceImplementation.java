package org.example.server.service;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClientBuilder;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@Service
@AllArgsConstructor
public class MedicImageServiceImplementation implements MedicImageService {
    @Override
    public String addImage(MultipartFile file) throws IOException {
        String connectionString = "DefaultEndpointsProtocol=https;AccountName=cabinetmedical;AccountKey=G8HT9IZkRdoiGYKkJ3e+ofs0OrMHtP6s1yINJWmzfMPjo5dPkqxe818auMeP9tzb19FbQP7O6Kzl+AStF0WA+g==;EndpointSuffix=core.windows.net";
        var container = new BlobContainerClientBuilder()
                .connectionString(connectionString)
                .containerName("cabinetmedical")
                .buildClient();

        var fileUUID = UUID.randomUUID();
        BlobClient blobClient = container.getBlobClient(fileUUID.toString());
        blobClient.upload(file.getInputStream(), file.getSize(), true);
        return blobClient.getBlobUrl();
    }

}
