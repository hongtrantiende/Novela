package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zq8  reason: default package */
/* loaded from: classes3.dex */
public final class zq8 extends n42 {
    public LinkedHashMap a;
    public Integer b;
    public pq8 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ar8 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq8(ar8 ar8Var, m42 m42Var) {
        super(m42Var);
        this.e = ar8Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(0, this);
    }
}
