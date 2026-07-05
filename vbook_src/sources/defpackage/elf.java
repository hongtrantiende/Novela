package defpackage;

import android.os.HandlerThread;
import com.google.common.util.concurrent.ListenableFuture;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import org.mozilla.javascript.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: elf  reason: default package */
/* loaded from: classes.dex */
public final class elf implements x00 {
    public int a;
    public Object b;
    public final Object c;
    public Object d;

    public elf(int i, vdf vdfVar) {
        this.c = vdfVar;
        this.a = i;
        this.b = new byte[0];
        this.d = new byte[0];
        if (i >= 10) {
            vdfVar.c(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public void a() {
        boolean z;
        HandlerThread handlerThread;
        synchronized (this.c) {
            try {
                if (this.a > 0) {
                    z = true;
                } else {
                    z = false;
                }
                wq9.D(z);
                int i = this.a - 1;
                this.a = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public byte[] b(byte[] bArr) {
        int i = this.a;
        vdf vdfVar = (vdf) this.c;
        byte[] bArr2 = (byte[]) this.d;
        int length = bArr2.length;
        byte[] bArr3 = (byte[]) this.b;
        if (length > 0) {
            return yqe.H(bArr3, vdfVar.c(yqe.H(bArr, bArr2), i));
        }
        return yqe.H(bArr3, vdfVar.c(bArr, i));
    }

    @Override // defpackage.x00
    public ListenableFuture call() {
        b7f b7fVar = (b7f) this.c;
        int i = this.a;
        ArrayList arrayList = (ArrayList) this.d;
        ListenableFuture c = dv4.c((hzd) this.b);
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) dv4.b((Future) arrayList.get(i2))).booleanValue()) {
                if (((List) b7fVar.b).get(i2) == null) {
                    s1f s1fVar = new s1f(1);
                    int i3 = khf.a;
                    c = dv4.f(c, new b7f(4, kff.a(), s1fVar), e73.a);
                } else {
                    vm1.h();
                    return null;
                }
            }
        }
        return c;
    }

    public /* synthetic */ elf(b7f b7fVar, hzd hzdVar, int i, ArrayList arrayList) {
        this.c = b7fVar;
        this.b = hzdVar;
        this.a = i;
        this.d = arrayList;
    }

    public elf() {
        this.c = new Object();
        this.b = null;
        this.d = null;
        this.a = 0;
    }

    public elf(byte[] bArr, int i) {
        int i2 = (i & 1) != 0 ? Context.VERSION_ES6 : 400;
        bArr = (i & 8) != 0 ? null : bArr;
        this.a = i2;
        this.c = ls3.a;
        this.d = "application/json";
        this.b = bArr;
    }
}
