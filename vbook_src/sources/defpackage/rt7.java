package defpackage;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rt7  reason: default package */
/* loaded from: classes.dex */
public final class rt7 extends n42 {
    public int C;
    public sw7 a;
    public FileInputStream b;
    public FileLock c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ st7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt7(st7 st7Var, n42 n42Var) {
        super(n42Var);
        this.f = st7Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.d(null, this);
    }
}
