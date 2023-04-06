// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.geometry.Transform3d;
import edu.wpi.first.math.geometry.Translation3d;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int DRIVER_CONTROLLER_PORT = 0;
    public static final int OPERATOR_CONTROLLER_PORT = 0;

    public static final int BACK_LEFT_ANGLE_ID = 4;
    public static final int BACK_LEFT_SPEED_ID = 3;
    public static final int BACK_RIGHT_ANGLE_ID = 6;
    public static final int BACK_RIGHT_SPEED_ID = 5;
    public static final int FRONT_LEFT_ANGLE_ID = 8;
    public static final int FRONT_LEFT_SPEED_ID = 7;
    public static final int FRONT_RIGHT_ANGLE_ID = 2;
    public static final int FRONT_RIGHT_SPEED_ID = 1;

    public static final double MAX_SPEED = 3;
    public static final double MAX_ANGULAR_SPEED = Math.PI;

    static class VisionConstants {
        static final Transform3d robotToCam =
                new Transform3d(
                        new Translation3d(0.5, 0.0, 0.5),
                        new Rotation3d(
                                0, 0,
                                0)); // Cam mounted facing forward, half a meter forward of center, half a meter up
        // from center.
        static final String cameraName = "Positioning Camera";
    }
}