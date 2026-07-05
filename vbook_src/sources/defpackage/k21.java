package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k21  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class k21 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k21(long j, yl9 yl9Var, WritableByteChannel writableByteChannel) {
        this.a = 0;
        this.b = j;
        this.c = yl9Var;
        this.d = writableByteChannel;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int max;
        int min;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                yl9 yl9Var = (yl9) obj3;
                WritableByteChannel writableByteChannel = (WritableByteChannel) obj2;
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                byteBuffer.getClass();
                long j = this.b - yl9Var.a;
                if (j < byteBuffer.remaining()) {
                    int limit = byteBuffer.limit();
                    byteBuffer.limit(byteBuffer.position() + ((int) j));
                    while (byteBuffer.hasRemaining()) {
                        writableByteChannel.write(byteBuffer);
                    }
                    byteBuffer.limit(limit);
                    yl9Var.a += j;
                } else {
                    long j2 = 0;
                    while (byteBuffer.hasRemaining()) {
                        j2 += writableByteChannel.write(byteBuffer);
                    }
                    yl9Var.a += j2;
                }
                return pvcVar;
            case 1:
                j2c j2cVar = (j2c) obj2;
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                List list = ((jwb) obj3).d;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    kwb kwbVar = (kwb) list.get(i2);
                    if (kwbVar.h != null && (max = Math.max(j2cVar.d, kwbVar.d)) <= (min = Math.min(j2cVar.e - 1, kwbVar.e - 1))) {
                        int i3 = kwbVar.b;
                        bce.m(ak3Var, max - i3, min - i3, kwbVar.a, nae.e, this.b, kwbVar.h);
                    }
                }
                return pvcVar;
            default:
                gaa gaaVar = (gaa) obj3;
                ((vjc) obj).getClass();
                ii2 ii2Var = gaaVar.b;
                gk2 gk2Var = ii2Var.U;
                String str = gaaVar.a;
                gk2Var.j0(str);
                int i4 = 0;
                for (Object obj4 : (List) obj2) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        rsa rsaVar = (rsa) obj4;
                        gk2 gk2Var2 = ii2Var.U;
                        String m = a82.m(str, "_", i4);
                        String str2 = gaaVar.a;
                        Map singletonMap = Collections.singletonMap("raw", rsaVar.a);
                        singletonMap.getClass();
                        String str3 = rsaVar.b;
                        String str4 = rsaVar.a;
                        ii2 ii2Var2 = ii2Var;
                        long j3 = this.b;
                        gk2Var2.F0(new tp2(m, str2, singletonMap, str3, str4, i4, j3, j3));
                        ii2Var = ii2Var2;
                        i4 = i5;
                    } else {
                        tl1.M();
                        throw null;
                    }
                }
                return pvcVar;
        }
    }

    public /* synthetic */ k21(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
