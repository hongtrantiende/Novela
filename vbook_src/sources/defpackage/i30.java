package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i30  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class i30 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AsynchronousFileChannel b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;

    public /* synthetic */ i30(AsynchronousFileChannel asynchronousFileChannel, byte[] bArr, int i, int i2, long j, int i3) {
        this.a = i3;
        this.b = asynchronousFileChannel;
        this.c = bArr;
        this.d = i;
        this.e = i2;
        this.f = j;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.e;
        int i3 = this.d;
        byte[] bArr = this.c;
        switch (i) {
            case 0:
                AsynchronousFileChannel asynchronousFileChannel = this.b;
                CompletionHandler completionHandler = (CompletionHandler) obj;
                asynchronousFileChannel.getClass();
                bArr.getClass();
                completionHandler.getClass();
                ByteBuffer wrap = ByteBuffer.wrap(bArr, i3, i2);
                long j = this.f;
                pvc pvcVar = pvc.a;
                asynchronousFileChannel.read(wrap, j, pvcVar, completionHandler);
                return pvcVar;
            default:
                AsynchronousFileChannel asynchronousFileChannel2 = this.b;
                CompletionHandler completionHandler2 = (CompletionHandler) obj;
                asynchronousFileChannel2.getClass();
                bArr.getClass();
                completionHandler2.getClass();
                ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i3, i2);
                long j2 = this.f;
                pvc pvcVar2 = pvc.a;
                asynchronousFileChannel2.write(wrap2, j2, pvcVar2, completionHandler2);
                return pvcVar2;
        }
    }
}
