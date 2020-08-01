/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * Modified by Sohom R.
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Gamepad Testing", group="CHS Tele-control")
public class GamepadTelemetryOpmode extends OpMode
{
        /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        // Tell the driver that initialization is complete.
        telemetry.addData("Status", "Initialized");
        telemetry.update();
    }

    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop() {
    }

    /*
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start() {

    }

    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop() {
        ButtonPress.giveMeInputs(gamepad1.a, gamepad1.b, gamepad1.x, gamepad1.y, gamepad1.dpad_up, gamepad1.dpad_down, gamepad1.dpad_right, gamepad1.dpad_left, gamepad1.right_bumper, gamepad1.left_bumper, gamepad1.left_stick_button, gamepad1.right_stick_button, gamepad2.a, gamepad2.b, gamepad2.x, gamepad2.y, gamepad2.dpad_up, gamepad2.dpad_down, gamepad2.dpad_right, gamepad2.dpad_left, gamepad2.right_bumper, gamepad2.left_bumper, gamepad2.left_stick_button, gamepad2.right_stick_button);

        telemetry.addData("Gamepad 1 Left Stick X", gamepad1.left_stick_x);
        telemetry.addData("Gamepad 1 Left Stick Y", gamepad1.left_stick_y);
        telemetry.addData("Gamepad 1 Right Stick X", gamepad1.right_stick_x);
        telemetry.addData("Gamepad 1 Right Stick X", gamepad1.right_stick_y);
        telemetry.addData("Gamepad 1 A:", ButtonPress.isGamepad1_a_pressed() ? "Pressed" : "Released");
        telemetry.addData("Gamepad 1 B:", ButtonPress.isGamepad1_b_pressed() ? "Pressed" : "Released");
        telemetry.addData("Gamepad 1 X:", ButtonPress.isGamepad1_x_pressed() ? "Pressed" : "Released");
        telemetry.addData("Gamepad 1 Y:", ButtonPress.isGamepad1_y_pressed() ? "Pressed" : "Released");
        telemetry.addData("Gamepad 1 DPAD UP:", ButtonPress.isGamepad1_dpad_up_pressed() ? "Pressed" : "Released");
        telemetry.addData("Gamepad 1 DPAD DOWN:", ButtonPress.isGamepad1_dpad_down_pressed() ? "Pressed" : "Released");
        telemetry.addData("Gamepad 1 DPAD RIGHT:", ButtonPress.isGamepad1_dpad_right_pressed() ? "Pressed" : "Released");
        telemetry.addData("Gamepad 1 DPAD LEFT:", ButtonPress.isGamepad1_dpad_left_pressed() ? "Pressed" : "Released");
        telemetry.addData("Gamepad 1 Right Bumper:", ButtonPress.isGamepad1_right_bumper_pressed() ? "Pressed" : "Released");
        telemetry.addData("Gamepad 1 Left Bumper:", ButtonPress.isGamepad1_left_bumper_pressed() ? "Pressed" : "Released");

        telemetry.addData("Gamepad 2 Left Stick X", gamepad2.left_stick_x);
        telemetry.addData("Gamepad 2 Left Stick Y", gamepad2.left_stick_y);
        telemetry.addData("Gamepad 2 Right Stick X", gamepad2.right_stick_x);
        telemetry.addData("Gamepad 2 Right Stick X", gamepad2.right_stick_y);
        telemetry.addData("Gamepad 2 A:", ButtonPress.isGamepad2_a_pressed() ? "Pressed" : "Released");
        telemetry.addData("Gamepad 2 B:", ButtonPress.isGamepad2_b_pressed() ? "Pressed" : "Released");
        telemetry.addData("Gamepad 2 X:", ButtonPress.isGamepad2_x_pressed() ? "Pressed" : "Released");
        telemetry.addData("Gamepad 2 Y:", ButtonPress.isGamepad2_y_pressed() ? "Pressed" : "Released");
        telemetry.addData("Gamepad 2 DPAD UP:", ButtonPress.isGamepad2_dpad_up_pressed() ? "Pressed" : "Released");
        telemetry.addData("Gamepad 2 DPAD DOWN:", ButtonPress.isGamepad2_dpad_down_pressed() ? "Pressed" : "Released");
        telemetry.addData("Gamepad 2 DPAD RIGHT:", ButtonPress.isGamepad2_dpad_right_pressed() ? "Pressed" : "Released");
        telemetry.addData("Gamepad 2 DPAD LEFT:", ButtonPress.isGamepad2_dpad_left_pressed() ? "Pressed" : "Released");
        telemetry.addData("Gamepad 2 Right Bumper:", ButtonPress.isGamepad2_right_bumper_pressed() ? "Pressed" : "Released");
        telemetry.addData("Gamepad 2 Left Bumper:", ButtonPress.isGamepad2_left_bumper_pressed() ? "Pressed" : "Released");

        telemetry.update();
    }

    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {
    }

}
