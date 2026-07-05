package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qw8  reason: default package */
/* loaded from: classes.dex */
public final class qw8 extends ReplacementSpan {
    public final int C;
    public Paint.FontMetricsInt D;
    public int E;
    public int F;
    public boolean G;
    public final float a;
    public final int b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;

    public qw8(float f, int i, float f2, int i2, r13 r13Var, int i3) {
        float f3;
        float f4 = nae.e;
        if (i == 0) {
            f3 = r13Var.k1(zr1.x(f, 4294967296L));
        } else {
            f3 = 0.0f;
        }
        f4 = i2 == 0 ? r13Var.k1(zr1.x(f2, 4294967296L)) : f4;
        this.a = f;
        this.b = i;
        this.c = f2;
        this.d = i2;
        this.e = f3;
        this.f = f4;
        this.C = i3;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.D;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        c16.w("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.G) {
            mv5.c("PlaceholderSpan is not laid out yet.");
        }
        return this.F;
    }

    public final int c() {
        if (!this.G) {
            mv5.c("PlaceholderSpan is not laid out yet.");
        }
        return this.E;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        float f2;
        this.G = true;
        float textSize = paint.getTextSize();
        this.D = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            mv5.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i3 = this.b;
        if (i3 != 0) {
            if (i3 == 1) {
                f = this.a * textSize;
            } else {
                mv5.b("Unsupported unit.");
                ls2.c();
                return 0;
            }
        } else {
            f = this.e;
        }
        this.E = (int) Math.ceil(f);
        int i4 = this.d;
        if (i4 != 0) {
            if (i4 == 1) {
                f2 = this.c * textSize;
            } else {
                mv5.b("Unsupported unit.");
                ls2.c();
                return 0;
            }
        } else {
            f2 = this.f;
        }
        this.F = (int) Math.ceil(f2);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.C) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int b = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = b;
                        fontMetricsInt.descent = b() + b;
                        break;
                    }
                    break;
                default:
                    mv5.a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return c();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
