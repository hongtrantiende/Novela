package defpackage;

import java.io.RandomAccessFile;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uh0  reason: default package */
/* loaded from: classes3.dex */
public final class uh0 extends aab implements xt4 {
    public final /* synthetic */ l6d a;
    public final /* synthetic */ RandomAccessFile b;
    public final /* synthetic */ long c;
    public final /* synthetic */ byte[] d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh0(l6d l6dVar, RandomAccessFile randomAccessFile, long j, byte[] bArr, int i, int i2, m42 m42Var) {
        super(1, m42Var);
        this.a = l6dVar;
        this.b = randomAccessFile;
        this.c = j;
        this.d = bArr;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        return new uh0(this.a, this.b, this.c, this.d, this.e, this.f, m42Var);
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        pvc pvcVar = pvc.a;
        ((uh0) create((m42) obj)).invokeSuspend(pvcVar);
        return pvcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        hre.r(obj);
        boolean z = this.a.e;
        RandomAccessFile randomAccessFile = this.b;
        if (!z) {
            randomAccessFile.seek(this.c);
        }
        randomAccessFile.write(this.d, this.e, this.f);
        return pvc.a;
    }
}
