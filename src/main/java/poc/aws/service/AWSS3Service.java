package poc.aws.service;

import org.springframework.web.multipart.MultipartFile;

public interface AWSS3Service {
  public void uploadFile(final MultipartFile multipartFile);
}
