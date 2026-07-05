package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ns7  reason: default package */
/* loaded from: classes.dex */
public final class ns7 extends Drawable implements Animatable {
    public Canvas D;
    public Bitmap E;
    public float H;
    public float I;
    public boolean J;
    public long K;
    public long L;
    public Picture N;
    public boolean P;
    public final Movie a;
    public final Bitmap.Config b;
    public final hz9 c;
    public final Paint d = new Paint(3);
    public final ArrayList e = new ArrayList();
    public final Rect f = new Rect();
    public final Rect C = new Rect();
    public float F = 1.0f;
    public float G = 1.0f;
    public int M = -1;
    public hw8 O = hw8.a;

    public ns7(Movie movie, Bitmap.Config config, hz9 hz9Var) {
        this.a = movie;
        this.b = config;
        this.c = hz9Var;
        if (!h50.s(config)) {
            return;
        }
        vs.m("Bitmap config must not be hardware.");
        throw null;
    }

    public final void a(Canvas canvas) {
        Paint paint = this.d;
        Canvas canvas2 = this.D;
        Bitmap bitmap = this.E;
        if (canvas2 != null && bitmap != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            int save = canvas2.save();
            try {
                float f = this.F;
                canvas2.scale(f, f);
                this.a.draw(canvas2, nae.e, nae.e, paint);
                Picture picture = this.N;
                if (picture != null) {
                    picture.draw(canvas2);
                }
                canvas2.restoreToCount(save);
                int save2 = canvas.save();
                try {
                    canvas.translate(this.H, this.I);
                    float f2 = this.G;
                    canvas.scale(f2, f2);
                    canvas.drawBitmap(bitmap, nae.e, nae.e, paint);
                } finally {
                    canvas.restoreToCount(save2);
                }
            } catch (Throwable th) {
                canvas2.restoreToCount(save);
                throw th;
            }
        }
    }

    public final void b(Rect rect) {
        Rect rect2 = this.f;
        if (!c16.i(rect2, rect)) {
            rect2.set(rect);
            int width = rect.width();
            int height = rect.height();
            Movie movie = this.a;
            int width2 = movie.width();
            int height2 = movie.height();
            if (width2 > 0 && height2 > 0) {
                cna cnaVar = cna.c;
                double v = ube.v(width2, height2, width, height, this.c, cnaVar);
                if (!this.P && v > 1.0d) {
                    v = 1.0d;
                }
                float f = (float) v;
                this.F = f;
                int i = (int) (width2 * f);
                int i2 = (int) (f * height2);
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, this.b);
                Bitmap bitmap = this.E;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.E = createBitmap;
                this.D = new Canvas(createBitmap);
                if (this.P) {
                    this.G = 1.0f;
                    this.H = nae.e;
                    this.I = nae.e;
                    return;
                }
                float v2 = (float) ube.v(i, i2, width, height, this.c, cnaVar);
                this.G = v2;
                this.H = ((width - (i * v2)) / 2.0f) + rect.left;
                this.I = ((height - (v2 * i2)) / 2.0f) + rect.top;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Movie movie = this.a;
        int duration = movie.duration();
        if (duration == 0) {
            duration = 0;
            z = false;
        } else {
            if (this.J) {
                this.L = SystemClock.uptimeMillis();
            }
            int i = (int) (this.L - this.K);
            int i2 = i / duration;
            int i3 = this.M;
            if (i3 != -1 && i2 > i3) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                duration = i - (i2 * duration);
            }
        }
        movie.setTime(duration);
        if (this.P) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.C;
            rect.set(0, 0, width, height);
            b(rect);
            int save = canvas.save();
            try {
                float f = 1.0f / this.F;
                canvas.scale(f, f);
                a(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            b(getBounds());
            a(canvas);
        }
        if (this.J && z) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.d.getAlpha() == 255) {
            hw8 hw8Var = this.O;
            if (hw8Var != hw8.b) {
                if (hw8Var == hw8.a && this.a.isOpaque()) {
                    return -1;
                }
                return -3;
            }
            return -1;
        }
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i >= 0 && i < 256) {
            this.d.setAlpha(i);
        } else {
            p1a.k(a82.j(i, "Invalid alpha: "));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.J) {
            return;
        }
        this.J = true;
        this.K = SystemClock.uptimeMillis();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vt4 vt4Var = ((f2d) arrayList.get(i)).a;
            if (vt4Var != null) {
                vt4Var.invoke();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.J) {
            this.J = false;
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                vt4 vt4Var = ((f2d) arrayList.get(i)).b;
                if (vt4Var != null) {
                    vt4Var.invoke();
                }
            }
        }
    }
}
