// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_mcc.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

public class opencv_mcc extends org.bytedeco.opencv.presets.opencv_mcc {
    static { Loader.load(); }

// Parsed from <opencv2/mcc.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

/*
 * MIT License
 *
 * Copyright (c) 2018 Pedro Diamel Marrero Fernández
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// #ifndef __OPENCV_MCC_HPP__
// #define __OPENCV_MCC_HPP__


// #include "mcc/checker_detector.hpp"
// #include "mcc/checker_model.hpp"
// #include "mcc/ccm.hpp"

/** \defgroup mcc Macbeth Chart module
\{
    \defgroup color_correction Color Correction Model
\}
<p>
<p>
\addtogroup mcc
<p>
Introduction
------------
<p>
ColorCharts are a tool for calibrating the color profile of camera, which not
only depends on the intrinsic and extrinsic parameters of camera but also on the
lighting conditions. This is done by taking the image of a chart, such that the
value of its colors present in it known, in the image the color values changes
depeding on many variables, this gives us the colors initially present and the
colors that are present in the image, based on this information we can apply any
suitable algorithm to find the actual color of all the objects present in the
image.
<p>
*/

// #endif


// Parsed from <opencv2/mcc/checker_model.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

/*
 * MIT License
 *
 * Copyright (c) 2018 Pedro Diamel Marrero Fernández
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// #ifndef __OPENCV_MCC_CHECKER_MODEL_HPP__
// #define __OPENCV_MCC_CHECKER_MODEL_HPP__
// #include <opencv2/core.hpp>
// #include <opencv2/imgproc.hpp>

/** \addtogroup mcc
 *  \{
<p>
/** TYPECHART
 *
 * \brief enum to hold the type of the checker
 *
 */
/** enum cv::mcc::TYPECHART */
public static final int
    /** Standard Macbeth Chart with 24 squares */
    MCC24 = 0,
    /** DigitalSG with 140 squares */
    SG140 = 1,
    /** DKK color chart with 12 squares and 6 rectangle */
    VINYL18 = 2;
// Targeting ../opencv_mcc/CChecker.java


// Targeting ../opencv_mcc/CCheckerDraw.java



/** \} mcc */
 // namespace mcc
 // namespace cv

// #endif


// Parsed from <opencv2/mcc/checker_detector.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

/*
 * MIT License
 *
 * Copyright (c) 2018 Pedro Diamel Marrero Fernández
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// #ifndef __OPENCV_MCC_CHECKER_DETECTOR_HPP__
// #define __OPENCV_MCC_CHECKER_DETECTOR_HPP__
// #include <opencv2/core.hpp>
// #include "checker_model.hpp"
// #include <opencv2/dnn.hpp>

//----------To view debugging output-----------------------------
//Read the tutorial on how to use debugging in this module
//It can be found in the documentation of 'mcc' modules,
//Then uncomment the following line to view debugging output
//---------------------------------------------------------------
// #define MCC_DEBUG
//---------------------------------------------------------------
// Targeting ../opencv_mcc/DetectorParameters.java


// Targeting ../opencv_mcc/CCheckerDetector.java



/** \} mcc */

 // namespace mcc
 // namespace cv

// #endif


// Parsed from <opencv2/mcc/ccm.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.
//
//
//                       License Agreement
//              For Open Source Computer Vision Library
//
// Copyright(C) 2020, Huawei Technologies Co.,Ltd. All rights reserved.
// Third party copyrights are property of their respective owners.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//             http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
// Author: Longbu Wang <wanglongbu@huawei.com.com>
//         Jinheng Zhang <zhangjinheng1@huawei.com>
//         Chenqi Shan <shanchenqi@huawei.com>

// #ifndef __OPENCV_MCC_CCM_HPP__
// #define __OPENCV_MCC_CCM_HPP__

// #include <opencv2/core.hpp>
// #include <opencv2/imgproc.hpp>
/** \addtogroup color_correction
\{
<p>
Introduction
------------
<p>
The purpose of color correction is to adjust the color response of input
and output devices to a known state. The device being calibrated is sometimes
called the calibration source; the color space used as the standard is sometimes
called the calibration target. Color calibration has been used in many industries,
such as television production, games, photography, engineering, chemistry,
medicine, etc. Due to the manufacturing process of the input and output equipment,
the channel response has nonlinear distortion. In order to correct the picture output
of the equipment, it is nessary to calibrate the captured color and the actual color.
<p>
*/



/** \brief Enum of the possible types of ccm.
*/
/** enum cv::ccm::CCM_TYPE */
public static final int
    /** The CCM with the shape {@code 3\times3} performs linear transformation on color values. */
    CCM_3x3 = 0,
    /** The CCM with the shape {@code 4\times3} performs affine transformation. */
    CCM_4x3 = 1;

/** \brief Enum of the possible types of initial method.
*/
/** enum cv::ccm::INITIAL_METHOD_TYPE */
public static final int
    /** The white balance method. The initial value is:\n */
    INITIAL_METHOD_WHITE_BALANCE = 0,
                        /** {@code 
                         *  M_{CCM}=
                         *  \begin{bmatrix}
                         *  k_R & 0 & 0\\
                        /// 0 & k_G & 0\\
                        /// 0 & 0 & k_B\\
                        /// \end{bmatrix}
                         *  }\n
                         *  where\n
                         *  {@code 
                         *  k_R=mean(R_{li}')/mean(R_{li})\\
                        /// k_R=mean(G_{li}')/mean(G_{li})\\
                        /// k_R=mean(B_{li}')/mean(B_{li})
                         *  } */
    /**the least square method is an optimal solution under the linear RGB distance function */
    INITIAL_METHOD_LEAST_SQUARE = 1;
/** \brief  Macbeth and Vinyl ColorChecker with 2deg D50
*/
/** enum cv::ccm::CONST_COLOR */
public static final int
    /** Macbeth ColorChecker */
    COLORCHECKER_Macbeth = 0,
    /** DKK ColorChecker */
    COLORCHECKER_Vinyl = 1,
    /** DigitalSG ColorChecker with 140 squares */
    COLORCHECKER_DigitalSG = 2;
/** enum cv::ccm::COLOR_SPACE */
public static final int
    /** https://en.wikipedia.org/wiki/SRGB , RGB color space */
    COLOR_SPACE_sRGB = 0,
    /** https://en.wikipedia.org/wiki/SRGB , linear RGB color space */
    COLOR_SPACE_sRGBL = 1,
    /** https://en.wikipedia.org/wiki/Adobe_RGB_color_space , RGB color space */
    COLOR_SPACE_AdobeRGB = 2,
    /** https://en.wikipedia.org/wiki/Adobe_RGB_color_space , linear RGB color space */
    COLOR_SPACE_AdobeRGBL = 3,
    /** https://en.wikipedia.org/wiki/Wide-gamut_RGB_color_space , RGB color space */
    COLOR_SPACE_WideGamutRGB = 4,
    /** https://en.wikipedia.org/wiki/Wide-gamut_RGB_color_space , linear RGB color space */
    COLOR_SPACE_WideGamutRGBL = 5,
    /** https://en.wikipedia.org/wiki/ProPhoto_RGB_color_space , RGB color space */
    COLOR_SPACE_ProPhotoRGB = 6,
    /** https://en.wikipedia.org/wiki/ProPhoto_RGB_color_space , linear RGB color space */
    COLOR_SPACE_ProPhotoRGBL = 7,
    /** https://en.wikipedia.org/wiki/DCI-P3 , RGB color space */
    COLOR_SPACE_DCI_P3_RGB = 8,
    /** https://en.wikipedia.org/wiki/DCI-P3 , linear RGB color space */
    COLOR_SPACE_DCI_P3_RGBL = 9,
    /** https://en.wikipedia.org/wiki/RGB_color_space , RGB color space */
    COLOR_SPACE_AppleRGB = 10,
    /** https://en.wikipedia.org/wiki/RGB_color_space , linear RGB color space */
    COLOR_SPACE_AppleRGBL = 11,
    /** https://en.wikipedia.org/wiki/Rec._709 , RGB color space */
    COLOR_SPACE_REC_709_RGB = 12,
    /** https://en.wikipedia.org/wiki/Rec._709 , linear RGB color space */
    COLOR_SPACE_REC_709_RGBL = 13,
    /** https://en.wikipedia.org/wiki/Rec._2020 , RGB color space */
    COLOR_SPACE_REC_2020_RGB = 14,
    /** https://en.wikipedia.org/wiki/Rec._2020 , linear RGB color space */
    COLOR_SPACE_REC_2020_RGBL = 15,
    /** https://en.wikipedia.org/wiki/CIE_1931_color_space , non-RGB color space */
    COLOR_SPACE_XYZ_D65_2 = 16,
    /** non-RGB color space */
    COLOR_SPACE_XYZ_D65_10 = 17,
    /** non-RGB color space */
    COLOR_SPACE_XYZ_D50_2 = 18,
    /** non-RGB color space */
    COLOR_SPACE_XYZ_D50_10 = 19,
    /** non-RGB color space */
    COLOR_SPACE_XYZ_A_2 = 20,
    /** non-RGB color space */
    COLOR_SPACE_XYZ_A_10 = 21,
    /** non-RGB color space */
    COLOR_SPACE_XYZ_D55_2 = 22,
    /** non-RGB color space */
    COLOR_SPACE_XYZ_D55_10 = 23,
    /** non-RGB color space */
    COLOR_SPACE_XYZ_D75_2 = 24,
    /** non-RGB color space */
    COLOR_SPACE_XYZ_D75_10 = 25,
    /** non-RGB color space */
    COLOR_SPACE_XYZ_E_2 = 26,
    /** non-RGB color space */
    COLOR_SPACE_XYZ_E_10 = 27,
    /** https://en.wikipedia.org/wiki/CIELAB_color_space , non-RGB color space */
    COLOR_SPACE_Lab_D65_2 = 28,
    /** non-RGB color space */
    COLOR_SPACE_Lab_D65_10 = 29,
    /** non-RGB color space */
    COLOR_SPACE_Lab_D50_2 = 30,
    /** non-RGB color space */
    COLOR_SPACE_Lab_D50_10 = 31,
    /** non-RGB color space */
    COLOR_SPACE_Lab_A_2 = 32,
    /** non-RGB color space */
    COLOR_SPACE_Lab_A_10 = 33,
    /** non-RGB color space */
    COLOR_SPACE_Lab_D55_2 = 34,
    /** non-RGB color space */
    COLOR_SPACE_Lab_D55_10 = 35,
    /** non-RGB color space */
    COLOR_SPACE_Lab_D75_2 = 36,
    /** non-RGB color space */
    COLOR_SPACE_Lab_D75_10 = 37,
    /** non-RGB color space */
    COLOR_SPACE_Lab_E_2 = 38,
    /** non-RGB color space */
    COLOR_SPACE_Lab_E_10 = 39;

/** \brief Linearization transformation type
<p>
The first step in color correction is to linearize the detected colors.
Because the input color space has not been calibrated, we usually use some empirical methods to linearize.
There are several common linearization methods.
The first is identical transformation, the second is gamma correction, and the third is polynomial fitting.
<p>
Linearization is generally an elementwise function. The mathematical symbols are as follows:
<p>
{@code C}: any channel of a color, could be {@code R, G} or {@code B}.
<p>
{@code R, G,  B}:  {@code R, G, B} channels respectively.
<p>
{@code G}: grayscale;
<p>
{@code s,sl}: subscript, which represents the detected data and its linearized value, the former is the input and the latter is the output;
<p>
{@code d,dl}: subscript, which represents the reference data and its linearized value
<p>
<p>
<p>
### Identical Transformation
<p>
No change is made during the Identical transformation linearization, usually because the tristimulus values of the input RGB image is already proportional to the luminance.
For example, if the input measurement data is in RAW format, the measurement data is already linear, so no linearization is required.
<p>
The identity transformation formula is as follows:
<p>
<pre>{@code \[
C_{sl}=C_s
\]}</pre>
<p>
### Gamma Correction
<p>
Gamma correction is a means of performing nonlinearity in RGB space, see the Color Space documentation for details.
In the linearization part, the value of {@code \gamma} is usually set to 2.2.
You can also customize the value.
<p>
The formula for gamma correction linearization is as follows:
<pre>{@code \[
C_{sl}=C_s^{\gamma},\qquad C_s\ge0\\
C_{sl}=-(-C_s)^{\gamma},\qquad C_s<0\\\\
\]}</pre>
<p>
### Polynomial Fitting
<p>
Polynomial fitting uses polynomials to linearize.
Provided the polynomial is:
<pre>{@code \[
f(x)=a_nx^n+a_{n-1}x^{n-1}+... +a_0
\]}</pre>
Then:
<pre>{@code \[
C_{sl}=f(C_s)
\]}</pre>
In practice, {@code n\le3} is used to prevent overfitting.
<p>
There are many variants of polynomial fitting, the difference lies in the way of generating {@code f(x)}.
It is usually necessary to use linearized reference colors and corresponding detected colors to calculate the polynomial parameters.
However, not all colors can participate in the calculation. The saturation detected colors needs to be removed. See the algorithm introduction document for details.
<p>
#### Fitting Channels Respectively
<p>
Use three polynomials, {@code r(x), g(x), b(x)},  to linearize each channel of the RGB color space[1-3]:
<pre>{@code \[
R_{sl}=r(R_s)\\
G_{sl}=g(G_s)\\
B_{sl}=b(B_s)\\
\]}</pre>
The polynomial is generated by minimizing the residual sum of squares between the detected data and the linearized reference data.
Take the R-channel as an example:
<p>
<pre>{@code \[
R=\arg min_{f}(\Sigma(R_{dl}-f(R_S)^2)
\]}</pre>
<p>
It's equivalent to finding the least square regression for below equations:
<pre>{@code \[
f(R_{s1})=R_{dl1}\\
f(R_{s2})=R_{dl2}\\
...
\]}</pre>
<p>
With a polynomial, the above equations becomes:
<pre>{@code \[
\begin{bmatrix}
R_{s1}^{n} & R_{s1}^{n-1} & ... & 1\\
R_{s2}^{n} & R_{s2}^{n-1} & ... & 1\\
... & ... & ... & ...
\end{bmatrix}
\begin{bmatrix}
a_{n}\\
a_{n-1}\\
... \\
a_0
\end{bmatrix}
=
\begin{bmatrix}
R_{dl1}\\
R_{dl2}\\
...
\end{bmatrix}
\]}</pre>
It can be expressed as a system of linear equations:
<p>
<pre>{@code \[
AX=B
\]}</pre>
<p>
When the number of reference colors is not less than the degree of the polynomial, the linear system has a least-squares solution:
<p>
<pre>{@code \[
X=(A^TA)^{-1}A^TB
\]}</pre>
<p>
Once we get the polynomial coefficients, we can get the polynomial r.
<p>
This method of finding polynomial coefficients can be implemented by numpy.polyfit in numpy, expressed here as:
<p>
<pre>{@code \[
R=polyfit(R_S, R_{dl})
\]}</pre>
<p>
Note that, in general, the polynomial that we want to obtain is guaranteed to monotonically increase in the interval [0,1] ,
but this means that nonlinear method is needed to generate the polynomials(see [4] for detail).
This would greatly increases the complexity of the program.
Considering that the monotonicity does not affect the correct operation of the color correction program, polyfit is still used to implement the program.
<p>
Parameters for other channels can also be derived in a similar way.
<p>
#### Grayscale Polynomial Fitting
<p>
In this method[2], single polynomial is used for all channels.
The polynomial is still a polyfit result from the detected colors to the linear reference colors.
However, only the gray of the reference colors can participate in the calculation.
<p>
Since the detected colors corresponding to the gray of reference colors is not necessarily gray, it needs to be grayed.
Grayscale refers to the Y channel of the XYZ color space.
The color space of the detected data is not determined and cannot be converted into the XYZ space.
Therefore, the sRGB formula is used to approximate[5].
<pre>{@code \[
G_{s}=0.2126R_{s}+0.7152G_{s}+0.0722B_{s}
\]}</pre>
Then the polynomial parameters can be obtained by using the polyfit.
<pre>{@code \[
f=polyfit(G_{s}, G_{dl})
\]}</pre>
After {@code f} is obtained, linearization can be performed.
<p>
#### Logarithmic Polynomial Fitting
<p>
For gamma correction formula, we take the logarithm:
<pre>{@code \[
ln(C_{sl})={\gamma}ln(C_s),\qquad C_s\ge0\
\]}</pre>
It can be seen that there is a linear relationship between {@code ln(C_s)} and {@code ln(C_{sl})}. It can be considered that the formula is an approximation of a polynomial relationship, that is, there exists a polynomial {@code f}, which makes[2]:
<pre>{@code \[
ln(C_{sl})=f(ln(C_s)), \qquad C_s>0\\
C_{sl}=0, \qquad C_s=0
\]}</pre>
<p>
Because {@code exp(ln(0))\to\infty }, the channel whose component is 0 is directly mapped to 0 in the formula above.
<p>
For fitting channels respectively, we have:
<pre>{@code \[
r=polyfit(ln(R_s),ln(R_{dl}))\\
g=polyfit(ln(G_s),ln(G_{dl}))\\
b=polyfit(ln(B_s),ln(B_{dl}))\\
\]}</pre>
Note that the parameter of {@code ln(*) } cannot be 0.
Therefore, we need to delete the channels whose values are 0 from {@code R_s } and {@code R_{dl} }, {@code G_s} and {@code G_{dl}}, {@code B_s} and {@code B_{dl}}.
<p>
Therefore:
<p>
<pre>{@code \[
ln(R_{sl})=r(ln(R_s)), \qquad R_s>0\\
R_{sl}=0, \qquad R_s=0\\
ln(G_{sl})=g(ln(G_s)),\qquad G_s>0\\
G_{sl}=0, \qquad G_s=0\\
ln(B_{sl})=b(ln(B_s)),\qquad B_s>0\\
B_{sl}=0, \qquad B_s=0\\
\]}</pre>
<p>
For grayscale polynomials, there are also:
<pre>{@code \[
f=polyfit(ln(G_{sl}),ln(G_{dl}))
\]}</pre>
and:
<pre>{@code \[
ln(C_{sl})=f(ln(C_s)), \qquad C_s>0\\
C_sl=0, \qquad C_s=0
\]}</pre>
*/
/** enum cv::ccm::LINEAR_TYPE */
public static final int

    /**no change is made */
    LINEARIZATION_IDENTITY = 0,
    /**gamma correction; Need assign a value to gamma simultaneously */
    LINEARIZATION_GAMMA = 1,
    /**polynomial fitting channels respectively; Need assign a value to deg simultaneously */
    LINEARIZATION_COLORPOLYFIT = 2,
    /**logarithmic polynomial fitting channels respectively; Need assign a value to deg simultaneously */
    LINEARIZATION_COLORLOGPOLYFIT = 3,
    /**grayscale polynomial fitting; Need assign a value to deg and dst_whites simultaneously */
    LINEARIZATION_GRAYPOLYFIT = 4,
    /**grayscale Logarithmic polynomial fitting;  Need assign a value to deg and dst_whites simultaneously */
    LINEARIZATION_GRAYLOGPOLYFIT = 5;

/** \brief Enum of possible functions to calculate the distance between colors.
<p>
See https://en.wikipedia.org/wiki/Color_difference for details
*/
/** enum cv::ccm::DISTANCE_TYPE */
public static final int
    /**The 1976 formula is the first formula that related a measured color difference to a known set of CIELAB coordinates. */
    DISTANCE_CIE76 = 0,
    /**The 1976 definition was extended to address perceptual non-uniformities. */
    DISTANCE_CIE94_GRAPHIC_ARTS = 1,
    DISTANCE_CIE94_TEXTILES = 2,
    DISTANCE_CIE2000 = 3,
    /**In 1984, the Colour Measurement Committee of the Society of Dyers and Colourists defined a difference measure, also based on the L*C*h color model. */
    DISTANCE_CMC_1TO1 = 4,
    DISTANCE_CMC_2TO1 = 5,
    /**Euclidean distance of rgb color space */
    DISTANCE_RGB = 6,
    /**Euclidean distance of rgbl color space */
    DISTANCE_RGBL = 7;
// Targeting ../opencv_mcc/ColorCorrectionModel.java



/** \} ccm */
 // namespace ccm
 // namespace cv

// #endif

}
