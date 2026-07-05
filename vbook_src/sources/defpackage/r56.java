package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r56  reason: default package */
/* loaded from: classes3.dex */
public final class r56 extends n42 {
    public final /* synthetic */ s56 C;
    public int D;
    public jr2 a;
    public s56 b;
    public LinkedHashMap c;
    public String d;
    public int e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r56(s56 s56Var, hh0 hh0Var) {
        super(hh0Var);
        this.C = s56Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.D |= Integer.MIN_VALUE;
        return s56.a(this.C, null, this);
    }
}
