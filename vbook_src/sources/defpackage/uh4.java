package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uh4  reason: default package */
/* loaded from: classes.dex */
public final class uh4 implements jm9 {
    public final fl a;

    public uh4(fl flVar) {
        this.a = flVar;
    }

    @Override // defpackage.jm9
    public final jm9 c() {
        return new uh4((fl) this.a.c());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh4)) {
            return false;
        }
        return this.a.equals(((uh4) obj).a);
    }

    @Override // defpackage.jm9
    public final Bitmap f0(vy5 vy5Var, int i) {
        int i2;
        int i3;
        Bitmap createBitmap;
        vy5 vy5Var2 = vy5Var;
        int i4 = vy5Var2.d;
        int i5 = vy5Var2.c;
        int i6 = vy5Var2.b;
        int i7 = vy5Var2.a;
        fl flVar = this.a;
        long j = flVar.x0().a;
        if (r4b.J(flVar.x0().b, "image/webp", true)) {
            if (i < 1) {
                i2 = 1;
            } else {
                i2 = i;
            }
        } else {
            i2 = 0;
        }
        if (i2 > 0) {
            int i8 = i7 - i2;
            if (i8 < 0) {
                i8 = 0;
            }
            int i9 = i6 - i2;
            if (i9 < 0) {
                i9 = 0;
            }
            int i10 = i5 + i2;
            int i11 = az5.c;
            i3 = 1;
            int i12 = (int) (j >> 32);
            if (i10 > i12) {
                i10 = i12;
            }
            int i13 = i4 + i2;
            int i14 = (int) (j & 4294967295L);
            if (i13 > i14) {
                i13 = i14;
            }
            vy5Var2 = new vy5(i8, i9, i10, i13);
        } else {
            i3 = 1;
        }
        Bitmap f0 = flVar.f0(vy5Var2, i);
        int i15 = i3;
        int max = Math.max(i15, (((i5 - i7) + i) - 1) / i);
        int max2 = Math.max(i15, (((i4 - i6) + i) - i15) / i);
        if (i2 > 0) {
            int i16 = (i7 - vy5Var2.a) / i;
            int i17 = (i6 - vy5Var2.b) / i;
            int width = f0.getWidth() - i16;
            if (width > max) {
                width = max;
            }
            int height = f0.getHeight() - i17;
            if (height > max2) {
                height = max2;
            }
            if (i16 > 0 || i17 > 0 || width != f0.getWidth() || height != f0.getHeight()) {
                Bitmap createBitmap2 = Bitmap.createBitmap(f0, i16, i17, width, height);
                createBitmap2.getClass();
                if (createBitmap2 != f0) {
                    f0.recycle();
                }
                f0 = createBitmap2;
            }
        }
        if (f0.getWidth() == max && f0.getHeight() == max2) {
            f0.prepareToDraw();
            return f0;
        }
        if (f0.getWidth() >= max && f0.getHeight() >= max2) {
            createBitmap = Bitmap.createBitmap(f0, 0, 0, max, max2);
        } else if (f0.getWidth() == max && f0.getHeight() == max2) {
            createBitmap = f0;
        } else {
            createBitmap = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            createBitmap.getClass();
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint(2);
            paint.setFilterBitmap(false);
            paint.setAntiAlias(false);
            canvas.drawBitmap(f0, nae.e, nae.e, paint);
            if (f0.getWidth() < max) {
                canvas.drawBitmap(f0, new Rect(f0.getWidth() - 1, 0, f0.getWidth(), f0.getHeight()), new Rect(f0.getWidth(), 0, max, f0.getHeight()), paint);
            }
            if (f0.getHeight() < max2) {
                canvas.drawBitmap(f0, new Rect(0, f0.getHeight() - 1, Math.min(f0.getWidth(), max), f0.getHeight()), new Rect(0, f0.getHeight(), Math.min(f0.getWidth(), max), max2), paint);
            }
            if (f0.getWidth() < max && f0.getHeight() < max2) {
                canvas.drawBitmap(f0, new Rect(f0.getWidth() - 1, f0.getHeight() - 1, f0.getWidth(), f0.getHeight()), new Rect(f0.getWidth(), f0.getHeight(), max, max2), paint);
            }
        }
        createBitmap.getClass();
        if (createBitmap != f0) {
            f0.recycle();
        }
        createBitmap.prepareToDraw();
        return createBitmap;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.jm9
    public final void j() {
        this.a.j();
    }

    public final String toString() {
        return "FixedSizeRegionDecoder(" + this.a + ")";
    }

    @Override // defpackage.jm9
    public final wn5 x0() {
        return this.a.x0();
    }
}
