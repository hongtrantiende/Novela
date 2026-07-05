package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hz3  reason: default package */
/* loaded from: classes.dex */
public final class hz3 {
    public final int a;
    public final boolean b;
    public final int c;

    public hz3(int i) {
        boolean z;
        this.a = i;
        int i2 = 0;
        if (i != 2 && i != 7 && i != 4 && i != 5) {
            z = false;
        } else {
            z = true;
        }
        this.b = z;
        switch (i) {
            case 3:
            case 4:
                i2 = 180;
                break;
            case 5:
            case 8:
                i2 = 270;
                break;
            case 6:
            case 7:
                i2 = 90;
                break;
        }
        this.c = i2;
    }

    public static Bitmap a(hz3 hz3Var, Bitmap bitmap) {
        boolean z;
        boolean z2 = hz3Var.b;
        int i = hz3Var.c;
        if (Math.abs(i % 360) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z2 && !z) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        if (z2) {
            matrix.postScale(-1.0f, 1.0f);
        }
        if (z) {
            matrix.postRotate(i);
        }
        RectF rectF = new RectF(nae.e, nae.e, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        matrix.postTranslate(-rectF.left, -rectF.top);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap((int) rectF.width(), (int) rectF.height(), config);
        createBitmap.getClass();
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(6));
        return createBitmap;
    }

    public final vy5 b(vy5 vy5Var, long j) {
        boolean z;
        int i = this.c;
        if (Math.abs(i % 360) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = -i;
        long y = eh.y(i2, j);
        if (z) {
            vy5Var = fca.A(i2, j, vy5Var);
        }
        if (this.b) {
            return fca.h(vy5Var, y);
        }
        return vy5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hz3.class == obj.getClass() && this.a == ((hz3) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExifOrientationHelper(");
        int i = this.a;
        switch (i) {
            case 0:
                str = "UNDEFINED";
                break;
            case 1:
                str = "NORMAL";
                break;
            case 2:
                str = "FLIP_HORIZONTAL";
                break;
            case 3:
                str = "ROTATE_180";
                break;
            case 4:
                str = "FLIP_VERTICAL";
                break;
            case 5:
                str = "TRANSPOSE";
                break;
            case 6:
                str = "ROTATE_90";
                break;
            case 7:
                str = "TRANSVERSE";
                break;
            case 8:
                str = "ROTATE_270";
                break;
            default:
                str = String.valueOf(i);
                break;
        }
        return s21.p(sb, str, ')');
    }
}
