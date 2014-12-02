/**
 * Flink Hands-on
 * Copyright (C) 2014  Sebastian Schelter
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.tuberlin.dima.flinkhandson;


import org.apache.flink.shaded.com.google.common.io.Resources;

import java.io.File;

public class Config {

  public static String OUTPUT_PATH = "/tmp/flink-hands-on/";

  private Config() {}

  public static String pathTo(String file) {
    return Resources.getResource(file).getFile();
  }

  public static String outputPathTo(String directory) {
    return new File(OUTPUT_PATH, directory).getAbsolutePath();
  }

}
