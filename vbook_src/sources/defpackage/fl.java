package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.os.Build;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fl  reason: default package */
/* loaded from: classes3.dex */
public final class fl implements jm9 {
    public final g7b a;
    public final bq5 b;
    public final mfb c;
    public BufferedInputStream d;
    public BitmapRegionDecoder e;
    public final mfb f;

    public fl(g7b g7bVar, bq5 bq5Var, wn5 wn5Var) {
        g7bVar.getClass();
        bq5Var.getClass();
        this.a = g7bVar;
        this.b = bq5Var;
        this.c = new mfb(new ve(this, 3));
        this.f = new mfb(new t7(2, wn5Var, this));
    }

    @Override // defpackage.jm9
    public final jm9 c() {
        return new fl(this.a, this.b, x0());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        BitmapRegionDecoder bitmapRegionDecoder = this.e;
        if (bitmapRegionDecoder != null) {
            bitmapRegionDecoder.recycle();
        }
        BufferedInputStream bufferedInputStream = this.d;
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fl.class != obj.getClass()) {
            return false;
        }
        fl flVar = (fl) obj;
        if (c16.i(this.a, flVar.a) && c16.i(this.b, flVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jm9
    public final Bitmap f0(vy5 vy5Var, int i) {
        Bitmap.Config config;
        j();
        String lowerCase = x0().b.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        if (!lowerCase.equals("image/webp") && !lowerCase.equals("image/png")) {
            config = Bitmap.Config.RGB_565;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        options.inPreferredConfig = config;
        BitmapRegionDecoder bitmapRegionDecoder = this.e;
        bitmapRegionDecoder.getClass();
        mfb mfbVar = this.c;
        vy5 b = ((hz3) mfbVar.getValue()).b(vy5Var, x0().a);
        Rect rect = new Rect(b.a, b.b, b.c, b.d);
        int width = bitmapRegionDecoder.getWidth();
        int height = bitmapRegionDecoder.getHeight();
        if (width > 0 && height > 0) {
            int i2 = width - 1;
            int i3 = 0;
            int n = dce.n(rect.left, 0, i2);
            int i4 = height - 1;
            int n2 = dce.n(rect.top, 0, i4);
            int n3 = dce.n(rect.right, n + 1, width);
            int n4 = dce.n(rect.bottom, n2 + 1, height);
            if (n3 <= n) {
                if (i2 < 0) {
                    i2 = 0;
                }
                n = i2;
            } else {
                width = n3;
            }
            if (n4 <= n2) {
                if (i4 >= 0) {
                    i3 = i4;
                }
                n2 = i3;
            } else {
                height = n4;
            }
            Bitmap decodeRegion = bitmapRegionDecoder.decodeRegion(new Rect(n, n2, width, height), options);
            if (decodeRegion != null) {
                return hz3.a((hz3) mfbVar.getValue(), decodeRegion);
            }
            throw new Exception("Invalid image. region decode return null");
        }
        p1a.k(rs8.k("Invalid decoder size: ", width, height, "x"));
        return null;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.jm9
    public final void j() {
        Object gs9Var;
        if (this.d != null && this.e != null) {
            return;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new ln0(tl1.q(this.b.a()), 3), 8192);
        this.d = bufferedInputStream;
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                gs9Var = BitmapRegionDecoder.newInstance(bufferedInputStream);
                gs9Var.getClass();
            } else {
                gs9Var = BitmapRegionDecoder.newInstance((InputStream) bufferedInputStream, false);
                gs9Var.getClass();
            }
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (!(gs9Var instanceof gs9)) {
            hre.r(gs9Var);
            this.e = (BitmapRegionDecoder) gs9Var;
            return;
        }
        try {
            bufferedInputStream.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
        Throwable a = hs9.a(gs9Var);
        a.getClass();
        throw a;
    }

    public final String toString() {
        return "AndroidRegionDecoder(subsamplingImage=" + this.a + ", imageSource=" + this.b + ")";
    }

    @Override // defpackage.jm9
    public final wn5 x0() {
        return (wn5) this.f.getValue();
    }
}
