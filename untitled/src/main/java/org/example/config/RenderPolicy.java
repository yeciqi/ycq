package org.example.config;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.template.ElementTemplate;

public interface RenderPolicy {
    void render(ElementTemplate eleTemplate, Object data, XWPFTemplate template);
}