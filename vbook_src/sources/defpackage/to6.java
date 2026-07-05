package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: to6  reason: default package */
/* loaded from: classes.dex */
public final class to6 implements LineHeightSpan {
    public int C = Integer.MIN_VALUE;
    public int D = Integer.MIN_VALUE;
    public int E = Integer.MIN_VALUE;
    public int F = Integer.MIN_VALUE;
    public int G;
    public int H;
    public final float a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final float e;
    public final int f;

    public to6(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.a = f;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = f2;
        this.f = i2;
        if ((nae.e <= f2 && f2 <= 1.0f) || f2 == -1.0f) {
            return;
        }
        mv5.c("topRatio should be in [0..1] range or -1");
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        boolean z2;
        int i5;
        int i6;
        double ceil;
        int min;
        int max;
        int i7 = fontMetricsInt.descent;
        int i8 = fontMetricsInt.ascent;
        if (i7 - i8 > 0) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            if (i2 == this.b) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i9 = this.f;
            boolean z3 = this.d;
            boolean z4 = this.c;
            if (z && z2 && z4 && z3 && i9 != 2) {
                return;
            }
            if (this.C == Integer.MIN_VALUE) {
                int i10 = i7 - i8;
                int ceil2 = (int) Math.ceil(this.a);
                int i11 = ceil2 - i10;
                if (i9 == 1 && i11 <= 0) {
                    int i12 = fontMetricsInt.ascent;
                    this.D = i12;
                    int i13 = fontMetricsInt.descent;
                    this.E = i13;
                    this.C = i12;
                    this.F = i13;
                    this.G = 0;
                    this.H = 0;
                } else {
                    float f = this.e;
                    if (f == -1.0f) {
                        f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                    }
                    if (i11 <= 0) {
                        ceil = Math.ceil(i11 * f);
                    } else {
                        ceil = Math.ceil((1.0f - f) * i11);
                    }
                    int i14 = (int) ceil;
                    int i15 = fontMetricsInt.descent;
                    int i16 = i14 + i15;
                    this.E = i16;
                    int i17 = i16 - ceil2;
                    this.D = i17;
                    if (i9 == 0 || i11 >= 0) {
                        if (z4) {
                            i17 = fontMetricsInt.ascent;
                        }
                        this.C = i17;
                        if (z3) {
                            i16 = i15;
                        }
                        this.F = i16;
                        this.G = fontMetricsInt.ascent - i17;
                        this.H = i16 - i15;
                    } else if (i9 == 2) {
                        int i18 = fontMetricsInt.ascent;
                        if (z4) {
                            min = Math.max(i18, i17);
                        } else {
                            min = Math.min(i18, i17);
                        }
                        this.C = min;
                        int i19 = fontMetricsInt.descent;
                        int i20 = this.E;
                        if (z3) {
                            max = Math.min(i19, i20);
                        } else {
                            max = Math.max(i19, i20);
                        }
                        this.F = max;
                        this.G = 0;
                        this.H = 0;
                    }
                }
            }
            if (z) {
                i5 = this.C;
            } else {
                i5 = this.D;
            }
            fontMetricsInt.ascent = i5;
            if (z2) {
                i6 = this.F;
            } else {
                i6 = this.E;
            }
            fontMetricsInt.descent = i6;
        }
    }
}
