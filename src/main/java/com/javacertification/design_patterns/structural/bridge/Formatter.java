package com.javacertification.design_patterns.structural.bridge;

import java.util.List;

/**
 * Created by Favio on 12/11/2017.
 */
public interface Formatter {
    String format(String header, List<Detail> details);
}
