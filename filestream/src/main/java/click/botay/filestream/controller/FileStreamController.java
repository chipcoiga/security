package click.botay.filestream.controller;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

@Controller
@EnableAutoConfiguration
public class FileStreamController {

    @RequestMapping(value = "/files/{file_name}", method = RequestMethod.GET)
    public void getFile(
            @PathVariable("file_name") String fileName,
            HttpServletResponse response) {
        System.out.println("Come on \t baby");
        try {

            Map<String, String> maps = new HashMap<>();
            maps.put("field1", "value1");
            maps.put("field2", "value2");
            maps.put("field3", "value3");
            maps.put("field4", "value4");

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);

            oos.writeObject(maps);
            oos.flush();
            oos.close();

            // get your file as InputStream
            InputStream is = new ByteArrayInputStream(baos.toByteArray());

//            helper.addAttachment("attachement",
//                    new ByteArrayResource(IOUtils.toByteArray(inputStream)));

            response.reset();
            response.setHeader("Content-Disposition", "attachment; filename=" + fileName);

            // copy it to response's OutputStream
            IOUtils.copy(is, response.getOutputStream());
            response.flushBuffer();
            System.out.println("Finish controller");
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.fillInStackTrace();
            throw new RuntimeException("IOError writing file to output stream");
        }

    }
}
