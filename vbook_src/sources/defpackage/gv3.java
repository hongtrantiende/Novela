package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gv3  reason: default package */
/* loaded from: classes.dex */
public final class gv3 extends n42 {
    public /* synthetic */ Object C;
    public final /* synthetic */ ov3 D;
    public int E;
    public la6 a;
    public List b;
    public List c;
    public Iterator d;
    public cp3 e;
    public List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv3(ov3 ov3Var, n42 n42Var) {
        super(n42Var);
        this.D = ov3Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.g(null, this);
    }
}
