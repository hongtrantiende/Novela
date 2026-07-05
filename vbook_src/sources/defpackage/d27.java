package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d27  reason: default package */
/* loaded from: classes.dex */
public final class d27 extends Drawable {
    public static final Paint w;
    public c27 a;
    public final hfa[] b;
    public final hfa[] c;
    public final BitSet d;
    public boolean e;
    public final Matrix f;
    public final Path g;
    public final Path h;
    public final RectF i;
    public final RectF j;
    public final Region k;
    public final Region l;
    public xea m;
    public final Paint n;
    public final Paint o;
    public final tea p;
    public final mce q;
    public final u67 r;
    public PorterDuffColorFilter s;
    public PorterDuffColorFilter t;
    public final RectF u;
    public final boolean v;

    static {
        Paint paint = new Paint(1);
        w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public d27(c27 c27Var) {
        u67 u67Var;
        this.b = new hfa[4];
        this.c = new hfa[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.o = paint2;
        this.p = new tea();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            u67Var = yea.a;
        } else {
            u67Var = new u67();
        }
        this.r = u67Var;
        this.u = new RectF();
        this.v = true;
        this.a = c27Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        h();
        g(getState());
        this.q = new mce(this);
    }

    public final void a(RectF rectF, Path path) {
        c27 c27Var = this.a;
        this.r.b(c27Var.a, c27Var.h, rectF, this.q, path);
        if (this.a.g != 1.0f) {
            Matrix matrix = this.f;
            matrix.reset();
            float f = this.a.g;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.u, true);
    }

    public final int b(int i) {
        this.a.getClass();
        c27 c27Var = this.a;
        c27Var.getClass();
        jp3 jp3Var = c27Var.b;
        if (jp3Var != null && jp3Var.a && tn1.d(i, 255) == jp3Var.c) {
            int alpha = Color.alpha(i);
            int d = tn1.d(i, 255);
            int i2 = jp3Var.b;
            return tn1.d(tn1.b(tn1.d(i2, Math.round(Color.alpha(i2) * nae.e)), d), alpha);
        }
        return i;
    }

    public final void c(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("d27", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.a.k;
        Path path = this.g;
        tea teaVar = this.p;
        if (i != 0) {
            canvas.drawPath(path, (Paint) teaVar.d);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            hfa hfaVar = this.b[i2];
            int i3 = this.a.j;
            Matrix matrix = hfa.b;
            hfaVar.a(matrix, teaVar, i3, canvas);
            this.c[i2].a(matrix, teaVar, this.a.j, canvas);
        }
        if (this.v) {
            int sin = (int) (Math.sin(Math.toRadians(0.0d)) * this.a.k);
            int cos = (int) (Math.cos(Math.toRadians(0.0d)) * this.a.k);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, w);
            canvas.translate(sin, cos);
        }
    }

    public final RectF d() {
        Rect bounds = getBounds();
        RectF rectF = this.i;
        rectF.set(bounds);
        return rectF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v27, types: [xea, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Paint paint;
        Paint paint2;
        int i2;
        float f;
        Path path;
        Canvas canvas2;
        Paint paint3;
        Paint paint4;
        float f2;
        float f3;
        float f4;
        PorterDuffColorFilter porterDuffColorFilter = this.s;
        Paint paint5 = this.n;
        paint5.setColorFilter(porterDuffColorFilter);
        int alpha = paint5.getAlpha();
        int i3 = this.a.i;
        paint5.setAlpha(((i3 + (i3 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        Paint paint6 = this.o;
        paint6.setColorFilter(porterDuffColorFilter2);
        this.a.getClass();
        paint6.setStrokeWidth(nae.e);
        int alpha2 = paint6.getAlpha();
        int i4 = this.a.i;
        paint6.setAlpha(((i4 + (i4 >>> 7)) * alpha2) >>> 8);
        boolean z = this.e;
        RectF rectF = this.j;
        Path path2 = this.h;
        Path path3 = this.g;
        if (z) {
            if (e()) {
                f3 = paint6.getStrokeWidth() / 2.0f;
            } else {
                f3 = 0.0f;
            }
            float f5 = -f3;
            xea xeaVar = this.a.a;
            nc2 nc2Var = xeaVar.a;
            nc2 nc2Var2 = xeaVar.b;
            nc2 nc2Var3 = xeaVar.c;
            nc2 nc2Var4 = xeaVar.d;
            f = 2.0f;
            y72 y72Var = xeaVar.e;
            y72 y72Var2 = xeaVar.f;
            i2 = alpha2;
            y72 y72Var3 = xeaVar.g;
            i = alpha;
            y72 y72Var4 = xeaVar.h;
            paint2 = paint6;
            tn3 tn3Var = xeaVar.i;
            paint = paint5;
            tn3 tn3Var2 = xeaVar.j;
            tn3 tn3Var3 = xeaVar.k;
            tn3 tn3Var4 = xeaVar.l;
            if (!(y72Var instanceof vm9)) {
                y72Var = new h8(f5, y72Var);
            }
            if (!(y72Var2 instanceof vm9)) {
                y72Var2 = new h8(f5, y72Var2);
            }
            if (!(y72Var4 instanceof vm9)) {
                y72Var4 = new h8(f5, y72Var4);
            }
            if (!(y72Var3 instanceof vm9)) {
                y72Var3 = new h8(f5, y72Var3);
            }
            ?? obj = new Object();
            obj.a = nc2Var;
            obj.b = nc2Var2;
            obj.c = nc2Var3;
            obj.d = nc2Var4;
            obj.e = y72Var;
            obj.f = y72Var2;
            obj.g = y72Var3;
            obj.h = y72Var4;
            obj.i = tn3Var;
            obj.j = tn3Var2;
            obj.k = tn3Var3;
            obj.l = tn3Var4;
            this.m = obj;
            float f6 = this.a.h;
            rectF.set(d());
            if (e()) {
                f4 = paint2.getStrokeWidth() / 2.0f;
            } else {
                f4 = nae.e;
            }
            rectF.inset(f4, f4);
            path2 = path2;
            this.r.b(obj, f6, rectF, null, path2);
            path = path3;
            a(d(), path);
            this.e = false;
        } else {
            i = alpha;
            paint = paint5;
            paint2 = paint6;
            i2 = alpha2;
            f = 2.0f;
            path = path3;
        }
        c27 c27Var = this.a;
        c27Var.getClass();
        if (c27Var.j > 0 && !this.a.a.d(d()) && !path.isConvex() && Build.VERSION.SDK_INT < 29) {
            canvas.save();
            canvas2 = canvas;
            canvas2.translate((int) (Math.sin(Math.toRadians(0.0d)) * this.a.k), (int) (Math.cos(Math.toRadians(0.0d)) * this.a.k));
            if (!this.v) {
                c(canvas);
                canvas2.restore();
            } else {
                RectF rectF2 = this.u;
                int width = (int) (rectF2.width() - getBounds().width());
                int height = (int) (rectF2.height() - getBounds().height());
                if (width >= 0 && height >= 0) {
                    Bitmap createBitmap = Bitmap.createBitmap((this.a.j * 2) + ((int) rectF2.width()) + width, (this.a.j * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(createBitmap);
                    float f7 = (getBounds().left - this.a.j) - width;
                    float f8 = (getBounds().top - this.a.j) - height;
                    canvas3.translate(-f7, -f8);
                    c(canvas3);
                    canvas2.drawBitmap(createBitmap, f7, f8, (Paint) null);
                    createBitmap.recycle();
                    canvas2.restore();
                } else {
                    vs.k("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    return;
                }
            }
        } else {
            canvas2 = canvas;
        }
        c27 c27Var2 = this.a;
        Paint.Style style = c27Var2.l;
        if (style != Paint.Style.FILL_AND_STROKE && style != Paint.Style.FILL) {
            paint3 = paint;
        } else {
            xea xeaVar2 = c27Var2.a;
            RectF d = d();
            if (xeaVar2.d(d)) {
                float a = xeaVar2.f.a(d) * this.a.h;
                paint3 = paint;
                canvas2.drawRoundRect(d, a, a, paint3);
            } else {
                paint3 = paint;
                canvas2.drawPath(path, paint3);
            }
        }
        if (e()) {
            xea xeaVar3 = this.m;
            rectF.set(d());
            if (e()) {
                f2 = paint2.getStrokeWidth() / f;
            } else {
                f2 = nae.e;
            }
            rectF.inset(f2, f2);
            if (xeaVar3.d(rectF)) {
                float a2 = xeaVar3.f.a(rectF) * this.a.h;
                paint4 = paint2;
                canvas2.drawRoundRect(rectF, a2, a2, paint4);
            } else {
                paint4 = paint2;
                canvas2.drawPath(path2, paint4);
            }
        } else {
            paint4 = paint2;
        }
        paint3.setAlpha(i);
        paint4.setAlpha(i2);
    }

    public final boolean e() {
        Paint.Style style = this.a.l;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.o.getStrokeWidth() > nae.e) {
            return true;
        }
        return false;
    }

    public final void f(Context context) {
        this.a.b = new jp3(context);
        this.a.getClass();
        this.a.j = (int) Math.ceil(0.0d);
        this.a.k = (int) Math.ceil(0.0d);
        h();
        super.invalidateSelf();
    }

    public final boolean g(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        if (this.a.c != null && color != (colorForState = this.a.c.getColorForState(iArr, (color = (paint = this.n).getColor())))) {
            paint.setColor(colorForState);
            z = true;
        } else {
            z = false;
        }
        this.a.getClass();
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.a.getClass();
        if (this.a.a.d(d())) {
            outline.setRoundRect(getBounds(), this.a.a.e.a(d()) * this.a.h);
            return;
        }
        RectF d = d();
        Path path = this.g;
        a(d, path);
        qka.x(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.f;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.k;
        region.set(bounds);
        RectF d = d();
        Path path = this.g;
        a(d, path);
        Region region2 = this.l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.t;
        c27 c27Var = this.a;
        ColorStateList colorStateList = c27Var.d;
        PorterDuff.Mode mode = c27Var.e;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        } else {
            int color = this.n.getColor();
            int b = b(color);
            if (b != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(b, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        }
        this.s = porterDuffColorFilter;
        this.a.getClass();
        this.t = null;
        this.a.getClass();
        if (Objects.equals(porterDuffColorFilter2, this.s) && Objects.equals(porterDuffColorFilter3, this.t)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.a.d;
            if (colorStateList == null || !colorStateList.isStateful()) {
                this.a.getClass();
                this.a.getClass();
                ColorStateList colorStateList2 = this.a.c;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable$ConstantState, c27] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        c27 c27Var = this.a;
        ?? constantState = new Drawable.ConstantState();
        constantState.c = null;
        constantState.d = null;
        constantState.e = PorterDuff.Mode.SRC_IN;
        constantState.f = null;
        constantState.g = 1.0f;
        constantState.h = 1.0f;
        constantState.i = 255;
        constantState.j = 0;
        constantState.k = 0;
        constantState.l = Paint.Style.FILL_AND_STROKE;
        constantState.a = c27Var.a;
        constantState.b = c27Var.b;
        constantState.c = c27Var.c;
        constantState.e = c27Var.e;
        constantState.d = c27Var.d;
        constantState.i = c27Var.i;
        constantState.g = c27Var.g;
        constantState.k = c27Var.k;
        constantState.h = c27Var.h;
        constantState.j = c27Var.j;
        constantState.l = c27Var.l;
        Rect rect = c27Var.f;
        if (rect != null) {
            constantState.f = new Rect(rect);
        }
        this.a = constantState;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        boolean g = g(iArr);
        boolean h = h();
        if (!g && !h) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        c27 c27Var = this.a;
        if (c27Var.i != i) {
            c27Var.i = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.a.d = colorStateList;
        h();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        c27 c27Var = this.a;
        if (c27Var.e != mode) {
            c27Var.e = mode;
            h();
            super.invalidateSelf();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable$ConstantState, c27] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d27(defpackage.xea r4) {
        /*
            r3 = this;
            c27 r0 = new c27
            r0.<init>()
            r1 = 0
            r0.c = r1
            r0.d = r1
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.e = r2
            r0.f = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.g = r2
            r0.h = r2
            r2 = 255(0xff, float:3.57E-43)
            r0.i = r2
            r2 = 0
            r0.j = r2
            r0.k = r2
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            r0.l = r2
            r0.a = r4
            r0.b = r1
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d27.<init>(xea):void");
    }
}
