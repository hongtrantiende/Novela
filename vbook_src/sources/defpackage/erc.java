package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: erc  reason: default package */
/* loaded from: classes.dex */
public final class erc implements o8b {
    public final int C;
    public final km8 a = new km8();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;

    public erc(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.c = bArr[24];
            this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.C = i;
            boolean z = (bArr[0] & 32) != 0;
            this.b = z;
            if (z) {
                this.f = a2d.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, nae.e, 0.95f);
                return;
            } else {
                this.f = 0.85f;
                return;
            }
        }
        this.c = 0;
        this.d = -1;
        this.e = "sans-serif";
        this.b = false;
        this.f = 0.85f;
        this.C = -1;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z3 = true;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z3 = false;
            }
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z3 && !z && !z2) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o8b
    public final void k(byte[] bArr, int i, int i2, n8b n8bVar, h12 h12Var) {
        boolean z;
        String x;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        km8 km8Var = this.a;
        km8Var.K(bArr, i + i2);
        km8Var.M(i);
        int i5 = 1;
        int i6 = 0;
        int i7 = 2;
        if (km8Var.a() >= 2) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        int G = km8Var.G();
        if (G == 0) {
            x = "";
        } else {
            int i8 = km8Var.b;
            Charset I = km8Var.I();
            int i9 = G - (km8Var.b - i8);
            if (I == null) {
                I = StandardCharsets.UTF_8;
            }
            x = km8Var.x(i9, I);
        }
        if (x.isEmpty()) {
            ms5 ms5Var = qs5.b;
            h12Var.accept(new wd2(-9223372036854775807L, -9223372036854775807L, mm9.e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(x);
        b(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.f;
        while (km8Var.a() >= 8) {
            int i10 = km8Var.b;
            int m = km8Var.m();
            int m2 = km8Var.m();
            if (m2 == 1937013100) {
                if (km8Var.a() >= i7) {
                    z3 = i5;
                } else {
                    z3 = i6;
                }
                wq9.s(z3);
                int G2 = km8Var.G();
                int i11 = i6;
                while (i11 < G2) {
                    if (km8Var.a() >= 12) {
                        z4 = i5;
                    } else {
                        z4 = i6;
                    }
                    wq9.s(z4);
                    int G3 = km8Var.G();
                    int G4 = km8Var.G();
                    km8Var.N(i7);
                    int i12 = i11;
                    int z5 = km8Var.z();
                    km8Var.N(i5);
                    int m3 = km8Var.m();
                    if (G4 > spannableStringBuilder.length()) {
                        StringBuilder s = hl5.s("Truncating styl end (", ") to cueText.length() (", G4);
                        s.append(spannableStringBuilder.length());
                        s.append(").");
                        st0.w("Tx3gParser", s.toString());
                        G4 = spannableStringBuilder.length();
                    }
                    if (G3 >= G4) {
                        st0.w("Tx3gParser", hl5.i(G3, G4, "Ignoring styl with start (", ") >= end (", ")."));
                        i4 = i12;
                    } else {
                        i4 = i12;
                        int i13 = G4;
                        b(spannableStringBuilder, z5, this.c, G3, i13, 0);
                        a(spannableStringBuilder, m3, this.d, G3, i13, 0);
                    }
                    i11 = i4 + 1;
                    i5 = 1;
                    i6 = 0;
                    i7 = 2;
                }
                i3 = i7;
            } else if (m2 == 1952608120 && this.b) {
                i3 = 2;
                if (km8Var.a() >= 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                wq9.s(z2);
                f = a2d.h(km8Var.G() / this.C, nae.e, 0.95f);
            } else {
                i3 = 2;
            }
            km8Var.M(i10 + m);
            i7 = i3;
            i5 = 1;
            i6 = 0;
        }
        h12Var.accept(new wd2(-9223372036854775807L, -9223372036854775807L, qs5.r(new td2(spannableStringBuilder, null, null, null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, nae.e, 0))));
    }

    @Override // defpackage.o8b
    public final int m() {
        return 2;
    }
}
