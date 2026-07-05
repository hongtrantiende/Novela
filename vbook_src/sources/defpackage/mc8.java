package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mc8  reason: default package */
/* loaded from: classes3.dex */
public final class mc8 extends n42 {
    public List a;
    public StringBuilder b;
    public ArrayList c;
    public /* synthetic */ Object d;
    public final /* synthetic */ oc8 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc8(oc8 oc8Var, n42 n42Var) {
        super(n42Var);
        this.e = oc8Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, null, this);
    }
}
