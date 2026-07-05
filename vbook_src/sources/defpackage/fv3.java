package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fv3  reason: default package */
/* loaded from: classes.dex */
public final class fv3 extends n42 {
    public final /* synthetic */ ov3 C;
    public int D;
    public la6 a;
    public List b;
    public List c;
    public Iterator d;
    public List e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv3(ov3 ov3Var, n42 n42Var) {
        super(n42Var);
        this.C = ov3Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.f(null, this);
    }
}
