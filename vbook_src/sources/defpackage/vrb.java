package defpackage;

import android.content.ClipData;
import android.view.DragEvent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vrb  reason: default package */
/* loaded from: classes.dex */
public final class vrb implements ih3 {
    public final /* synthetic */ qrb a;
    public final /* synthetic */ el7 b;
    public final /* synthetic */ qrb c;
    public final /* synthetic */ qrb d;
    public final /* synthetic */ qrb e;
    public final /* synthetic */ qrb f;

    public vrb(qrb qrbVar, el7 el7Var, qrb qrbVar2, qrb qrbVar3, qrb qrbVar4, qrb qrbVar5) {
        this.a = qrbVar;
        this.b = el7Var;
        this.c = qrbVar2;
        this.d = qrbVar3;
        this.e = qrbVar4;
        this.f = qrbVar5;
    }

    @Override // defpackage.ih3
    public final void M0(bh3 bh3Var) {
        this.e.invoke(bh3Var);
    }

    @Override // defpackage.ih3
    public final void S(bh3 bh3Var) {
        this.c.invoke(bh3Var);
    }

    @Override // defpackage.ih3
    public final void U0(bh3 bh3Var) {
        DragEvent dragEvent = bh3Var.a;
        long floatToRawIntBits = (Float.floatToRawIntBits(dragEvent.getX()) << 32) | (Float.floatToRawIntBits(dragEvent.getY()) & 4294967295L);
        trb trbVar = this.d.b;
        sc6 b = trbVar.N.b();
        if (b != null && b.t()) {
            floatToRawIntBits = b.O(floatToRawIntBits);
        }
        int d = trbVar.N.d(true, floatToRawIntBits);
        if (d >= 0) {
            trbVar.M.m(sze.a(d, d));
        }
        trbVar.O.z(h35.a, floatToRawIntBits);
    }

    @Override // defpackage.ih3
    public final void d0(bh3 bh3Var) {
        this.f.invoke(bh3Var);
    }

    @Override // defpackage.ih3
    public final boolean q1(bh3 bh3Var) {
        String str;
        this.a.invoke(bh3Var);
        DragEvent dragEvent = bh3Var.a;
        ClipData clipData = dragEvent.getClipData();
        dragEvent.getClipDescription();
        trb trbVar = (trb) this.b.b;
        trbVar.L1();
        trbVar.O.d();
        int itemCount = clipData.getItemCount();
        boolean z = false;
        for (int i = 0; i < itemCount; i++) {
            if (!z && clipData.getItemAt(i).getText() == null) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            int itemCount2 = clipData.getItemCount();
            boolean z2 = false;
            for (int i2 = 0; i2 < itemCount2; i2++) {
                CharSequence text = clipData.getItemAt(i2).getText();
                if (text != null) {
                    if (z2) {
                        sb.append("\n");
                    }
                    sb.append(text);
                    z2 = true;
                }
            }
            str = sb.toString();
        } else {
            str = null;
        }
        ck9.a(trbVar);
        if (str != null) {
            mkc.k(trbVar.M, str, false, 14);
        }
        return true;
    }

    @Override // defpackage.ih3
    public final void T0(bh3 bh3Var) {
    }
}
