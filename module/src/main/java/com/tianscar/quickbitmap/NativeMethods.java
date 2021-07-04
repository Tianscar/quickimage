/*
 * MIT License
 *
 * Copyright (c) 2021 Tianscar
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
 *
 */

package com.tianscar.quickbitmap;

import android.graphics.Bitmap;

import androidx.annotation.NonNull;

import java.io.OutputStream;

final class NativeMethods {

    static {
        System.loadLibrary("quickbitmap");
    }

    private NativeMethods(){}

    public static void fill(@NonNull Bitmap bitmap, int x, int y, int color) {
        nativeFill(bitmap, x, y, color);
    }

    public static void compressBMP(@NonNull Bitmap bitmap, OutputStream stream) {
        nativeCompressBMP(bitmap, stream);
    }

    private static native void nativeFill(Bitmap bitmap, int x, int y, int color);

    private static native void nativeCompressBMP(Bitmap bitmap, OutputStream stream);

}
