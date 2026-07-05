package defpackage;

import java.util.Iterator;
/* renamed from: xj4  reason: default package */
/* loaded from: classes3.dex */
public final class xj4 extends n42 {
    public int C;
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ s02 c;
    public tj4 d;
    public Iterator e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj4(s02 s02Var, m42 m42Var) {
        super(m42Var);
        this.c = s02Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
