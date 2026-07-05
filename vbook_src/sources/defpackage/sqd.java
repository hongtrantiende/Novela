package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sqd  reason: default package */
/* loaded from: classes3.dex */
public final class sqd extends n42 {
    public int C;
    public List a;
    public rz b;
    public j6d c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ r0f f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqd(r0f r0fVar, n42 n42Var) {
        super(n42Var);
        this.f = r0fVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.w(null, null, this);
    }
}
