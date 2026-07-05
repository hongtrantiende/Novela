package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.os.Build;
import java.io.BufferedInputStream;
import java.io.InputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gl  reason: default package */
/* loaded from: classes3.dex */
public final class gl implements jm9 {
    public final g7b a;
    public final bq5 b;
    public final mfb c;
    public BufferedInputStream d;
    public BitmapRegionDecoder e;
    public final mfb f;

    public gl(g7b g7bVar, bq5 bq5Var, wn5 wn5Var) {
        g7bVar.getClass();
        bq5Var.getClass();
        this.a = g7bVar;
        this.b = bq5Var;
        this.c = new mfb(new ve(this, 4));
        this.f = new mfb(new t7(3, wn5Var, this));
    }

    @Override // defpackage.jm9
    public final jm9 c() {
        return new gl(this.a, this.b, x0());
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
        if (obj == null || gl.class != obj.getClass()) {
            return false;
        }
        gl glVar = (gl) obj;
        if (c16.i(this.a, glVar.a) && c16.i(this.b, glVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jm9
    public final Bitmap f0(vy5 vy5Var, int i) {
        j();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        mfb mfbVar = this.c;
        vy5 b = ((hz3) mfbVar.getValue()).b(vy5Var, x0().a);
        BitmapRegionDecoder bitmapRegionDecoder = this.e;
        bitmapRegionDecoder.getClass();
        Bitmap decodeRegion = bitmapRegionDecoder.decodeRegion(new Rect(b.a, b.b, b.c, b.d), options);
        if (decodeRegion != null) {
            return hz3.a((hz3) mfbVar.getValue(), decodeRegion);
        }
        throw new Exception("Invalid image. region decode return null");
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
        return "AndroidRegionDecoder(subsamplingImage=" + this.a + ", imageSource=" + this.b + ')';
    }

    @Override // defpackage.jm9
    public final wn5 x0() {
        return (wn5) this.f.getValue();
    }
}
