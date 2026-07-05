package defpackage;

import java.util.Calendar;
import java.util.Date;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oyd  reason: default package */
/* loaded from: classes.dex */
public final class oyd extends xb1 {
    public final nyd d;

    public oyd(tkf tkfVar, int i, nyd nydVar) {
        super(tkfVar, i);
        char c;
        this.d = nydVar;
        StringBuilder sb = new StringBuilder("%");
        tkfVar.d(sb);
        if (true != tkfVar.c()) {
            c = 't';
        } else {
            c = 'T';
        }
        sb.append(c);
        sb.append(nydVar.a);
    }

    @Override // defpackage.xb1
    public final void R(cr3 cr3Var, Object obj) {
        char c;
        tkf tkfVar = (tkf) this.c;
        StringBuilder sb = (StringBuilder) cr3Var.g;
        boolean z = obj instanceof Date;
        nyd nydVar = this.d;
        if (!z && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            char c2 = nydVar.a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(c2).length() + 2);
            sb2.append("%t");
            sb2.append(c2);
            cr3.h(sb, obj, sb2.toString());
            return;
        }
        StringBuilder sb3 = new StringBuilder("%");
        tkfVar.d(sb3);
        if (true != tkfVar.c()) {
            c = 't';
        } else {
            c = 'T';
        }
        sb3.append(c);
        sb3.append(nydVar.a);
        sb.append(String.format(ykf.a, sb3.toString(), obj));
    }
}
