package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jv3  reason: default package */
/* loaded from: classes.dex */
public final class jv3 extends n42 {
    public int C;
    public String a;
    public j6d b;
    public Iterator c;
    public j6d d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ov3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv3(ov3 ov3Var, n42 n42Var) {
        super(n42Var);
        this.f = ov3Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.j(null, this);
    }
}
