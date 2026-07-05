package defpackage;

import android.graphics.Canvas;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mn  reason: default package */
/* loaded from: classes.dex */
public final class mn {
    public final ArrayList a;
    public final TextPaint b;
    public final evb c;
    public final List d;
    public final long e;
    public final float f;
    public final float g;
    public k57 h;

    public mn(ArrayList arrayList, int i, int i2, TextPaint textPaint, evb evbVar, List list) {
        list.getClass();
        this.a = arrayList;
        this.b = textPaint;
        this.c = evbVar;
        this.d = list;
        this.e = (i << 32) | (i2 & 4294967295L);
        r13 r13Var = evbVar.g;
        this.f = r13Var.L0(1.0f);
        this.g = r13Var.L0(2.0f);
    }

    public final rk9 a(int i) {
        int c = c(i);
        if (c != -1) {
            jvb jvbVar = (jvb) this.a.get(c);
            ArrayList arrayList = jvbVar.h;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                dnb dnbVar = (dnb) obj;
                if (dnbVar.a.length() + dnbVar.b > i) {
                    float f = dnbVar.c;
                    float f2 = jvbVar.d;
                    return new rk9(f, f2, dnbVar.d + f, jvbVar.f + f2);
                }
            }
            p1a.l("Collection contains no element matching the predicate.");
            return null;
        }
        return rk9.e;
    }

    public final float b(int i) {
        ArrayList arrayList = this.a;
        return ((jvb) arrayList.get(i)).d + ((jvb) arrayList.get(i)).f;
    }

    public final int c(int i) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            jvb jvbVar = (jvb) obj;
            if (i >= jvbVar.a && i < jvbVar.b) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final int d(long j) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jvb jvbVar = (jvb) arrayList.get(i);
            float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & j));
            float f = jvbVar.d;
            ArrayList arrayList2 = jvbVar.h;
            if (intBitsToFloat < f + jvbVar.f) {
                for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                    dnb dnbVar = (dnb) arrayList2.get(size2);
                    if (Float.intBitsToFloat((int) (j >> 32)) >= dnbVar.c) {
                        return dnbVar.b;
                    }
                }
                continue;
            }
        }
        return -1;
    }

    public final void e(k61 k61Var, long j) {
        sc1 sc1Var;
        ArrayList arrayList;
        jvb jvbVar;
        float f;
        float f2;
        int i;
        k61Var.getClass();
        int x = sve.x(j);
        Canvas canvas = tf.a;
        Canvas canvas2 = ((sf) k61Var).a;
        TextPaint textPaint = this.b;
        int i2 = textPaint.baselineShift;
        float textSize = textPaint.getTextSize();
        boolean isFakeBoldText = textPaint.isFakeBoldText();
        float textSkewX = textPaint.getTextSkewX();
        int color = textPaint.getColor();
        float strokeWidth = textPaint.getStrokeWidth();
        textPaint.setColor(x);
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            jvb jvbVar2 = (jvb) arrayList2.get(i3);
            ArrayList arrayList3 = jvbVar2.h;
            float f3 = jvbVar2.g;
            int size2 = arrayList3.size();
            ArrayList arrayList4 = arrayList2;
            int i4 = size;
            sc1 sc1Var2 = null;
            int i5 = 0;
            while (i5 < size2) {
                int i6 = i5;
                dnb dnbVar = (dnb) arrayList3.get(i5);
                Canvas canvas3 = canvas2;
                sc1 sc1Var3 = dnbVar.e;
                int i7 = i3;
                float f4 = dnbVar.d;
                if (!sc1Var3.equals(sc1Var2)) {
                    textPaint.setTextSize(sc1Var3.a);
                    textPaint.setFakeBoldText(sc1Var3.c);
                    if (sc1Var3.b) {
                        f2 = -0.25f;
                    } else {
                        f2 = nae.e;
                    }
                    textPaint.setTextSkewX(f2);
                    if (sc1Var3.f) {
                        i = i2 - ((int) (textPaint.ascent() / 2.0f));
                    } else if (sc1Var3.g) {
                        i = ((int) (textPaint.ascent() / 2.0f)) + i2;
                    } else {
                        i = i2;
                    }
                    textPaint.baselineShift = i;
                    sc1Var = sc1Var3;
                } else {
                    sc1Var = sc1Var2;
                }
                if (sc1Var3.e) {
                    float f5 = dnbVar.c;
                    jvb jvbVar3 = jvbVar2;
                    float f6 = jvbVar3.g;
                    arrayList = arrayList3;
                    f = f3;
                    jvbVar = jvbVar3;
                    canvas2 = canvas3;
                    canvas2.drawLine(f5, f6, f5 + f4, f6, textPaint);
                } else {
                    arrayList = arrayList3;
                    jvbVar = jvbVar2;
                    float f7 = f3;
                    if (sc1Var3.d) {
                        textPaint.setStrokeWidth(this.f);
                        canvas2 = canvas3;
                        float f8 = dnbVar.c;
                        float f9 = f7 + this.g;
                        f = f7;
                        canvas2.drawLine(f8, f9, f8 + f4, f9, textPaint);
                        textPaint.setStrokeWidth(strokeWidth);
                    } else {
                        canvas2 = canvas3;
                        f = f7;
                    }
                }
                canvas2.drawText(dnbVar.a, dnbVar.c, f, textPaint);
                i5 = i6 + 1;
                f3 = f;
                jvbVar2 = jvbVar;
                i3 = i7;
                sc1Var2 = sc1Var;
                arrayList3 = arrayList;
            }
            i3++;
            arrayList2 = arrayList4;
            size = i4;
        }
        textPaint.baselineShift = i2;
        textPaint.setTextSize(textSize);
        textPaint.setFakeBoldText(isFakeBoldText);
        textPaint.setTextSkewX(textSkewX);
        textPaint.setColor(color);
        textPaint.setStrokeWidth(strokeWidth);
    }
}
