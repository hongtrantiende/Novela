package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wj  reason: default package */
/* loaded from: classes.dex */
public final class wj implements nl8 {
    public final pn C;
    public final CharSequence D;
    public final bd6 E;
    public yx9 F;
    public final boolean G;
    public final int H;
    public final String a;
    public final oyb b;
    public final List c;
    public final List d;
    public final do4 e;
    public final r13 f;

    /* JADX WARN: Code restructure failed: missing block: B:179:0x03a5, code lost:
        if ((r6.b.c & 1095216660480L) != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
        if (r7 == 1) goto L460;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0851 A[LOOP:6: B:410:0x084f->B:411:0x0851, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f8  */
    /* JADX WARN: Type inference failed for: r0v0, types: [wj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.text.TextPaint, android.graphics.Paint, pn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wj(java.lang.String r43, defpackage.oyb r44, java.util.List r45, java.util.List r46, defpackage.do4 r47, defpackage.r13 r48) {
        /*
            Method dump skipped, instructions count: 2404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj.<init>(java.lang.String, oyb, java.util.List, java.util.List, do4, r13):void");
    }

    @Override // defpackage.nl8
    public final boolean b() {
        boolean z;
        yx9 yx9Var = this.F;
        if (yx9Var != null) {
            z = yx9Var.i();
        } else {
            z = false;
        }
        if (!z) {
            if (!this.G && dye.d(this.b)) {
                n07 n07Var = fq3.a;
                n07 n07Var2 = fq3.a;
                yya yyaVar = (yya) n07Var2.b;
                if (yyaVar == null) {
                    if (cq3.d()) {
                        yyaVar = n07Var2.o();
                        n07Var2.b = yyaVar;
                    } else {
                        yyaVar = bue.f;
                    }
                }
                if (((Boolean) yyaVar.getValue()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.nl8
    public final float h() {
        bd6 bd6Var = this.E;
        float f = bd6Var.e;
        TextPaint textPaint = bd6Var.b;
        if (!Float.isNaN(f)) {
            return bd6Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = bd6Var.a;
        lineInstance.setText(new oc1(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, eze.f);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new ry5(i, next, 1));
            } else {
                ty5 ty5Var = (ty5) priorityQueue.peek();
                if (ty5Var != null && ty5Var.b - ty5Var.a < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new ry5(i, next, 1));
                }
            }
            i = next;
        }
        boolean isEmpty = priorityQueue.isEmpty();
        float f2 = nae.e;
        if (!isEmpty) {
            Iterator it = priorityQueue.iterator();
            if (it.hasNext()) {
                ty5 ty5Var2 = (ty5) it.next();
                f2 = Layout.getDesiredWidth(bd6Var.b(), ty5Var2.a, ty5Var2.b, textPaint);
                while (it.hasNext()) {
                    ty5 ty5Var3 = (ty5) it.next();
                    f2 = Math.max(f2, Layout.getDesiredWidth(bd6Var.b(), ty5Var3.a, ty5Var3.b, textPaint));
                }
            } else {
                xk5.g();
                return nae.e;
            }
        }
        bd6Var.e = f2;
        return f2;
    }

    @Override // defpackage.nl8
    public final float l() {
        return this.E.c();
    }
}
