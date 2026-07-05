package defpackage;

import java.io.RandomAccessFile;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: th0  reason: default package */
/* loaded from: classes3.dex */
public final class th0 extends aab implements xt4 {
    public final /* synthetic */ RandomAccessFile a;
    public final /* synthetic */ long b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th0(RandomAccessFile randomAccessFile, long j, byte[] bArr, int i, int i2, m42 m42Var) {
        super(1, m42Var);
        this.a = randomAccessFile;
        this.b = j;
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        return new th0(this.a, this.b, this.c, this.d, this.e, m42Var);
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        return ((th0) create((m42) obj)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        hre.r(obj);
        long j = this.b;
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.seek(j);
        return new Integer(randomAccessFile.read(this.c, this.d, this.e));
    }
}
