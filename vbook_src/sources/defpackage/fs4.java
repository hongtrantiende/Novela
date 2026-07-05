package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fs4  reason: default package */
/* loaded from: classes.dex */
public final class fs4 implements es4 {
    public final int a;
    public final /* synthetic */ hs4 b;

    public fs4(hs4 hs4Var, int i) {
        this.b = hs4Var;
        this.a = i;
    }

    @Override // defpackage.es4
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        hs4 hs4Var = this.b;
        rr4 rr4Var = hs4Var.z;
        int i = this.a;
        if (rr4Var != null && i < 0 && rr4Var.m().R()) {
            return false;
        }
        return hs4Var.S(arrayList, arrayList2, i, 1);
    }
}
