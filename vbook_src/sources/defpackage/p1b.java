package defpackage;

import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p1b  reason: default package */
/* loaded from: classes.dex */
public final class p1b extends m03 implements zj3 {
    public final wi M;
    public final sn3 N;
    public RenderNode O;

    public p1b(hab habVar, wi wiVar, sn3 sn3Var) {
        this.M = wiVar;
        this.N = sn3Var;
        H1(habVar);
    }

    public static boolean K1(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == nae.e) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final RenderNode L1() {
        RenderNode renderNode = this.O;
        if (renderNode == null) {
            RenderNode e = dm.e();
            this.O = e;
            return e;
        }
        return renderNode;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02cd  */
    @Override // defpackage.zj3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V0(defpackage.qd6 r26) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p1b.V0(qd6):void");
    }
}
