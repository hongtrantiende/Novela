package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.crypto.Mac;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vdf  reason: default package */
/* loaded from: classes.dex */
public final class vdf implements yr5, s9f {
    public static vdf f;
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r5.equals("HMACSHA512") == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vdf(java.lang.String r5, javax.crypto.spec.SecretKeySpec r6) {
        /*
            r4 = this;
            r0 = 4
            r4.a = r0
            r4.<init>()
            flf r1 = new flf
            r1.<init>(r4)
            r4.c = r1
            r2 = 2
            boolean r3 = defpackage.eub.b(r2)
            if (r3 == 0) goto L92
            r4.d = r5
            r4.e = r6
            byte[] r6 = r6.getEncoded()
            int r6 = r6.length
            r3 = 16
            if (r6 < r3) goto L8a
            int r6 = r5.hashCode()
            r3 = -1
            switch(r6) {
                case -1823053428: goto L55;
                case 392315023: goto L4a;
                case 392315118: goto L3f;
                case 392316170: goto L34;
                case 392317873: goto L2b;
                default: goto L29;
            }
        L29:
            r0 = r3
            goto L5f
        L2b:
            java.lang.String r6 = "HMACSHA512"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L5f
            goto L29
        L34:
            java.lang.String r6 = "HMACSHA384"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L3d
            goto L29
        L3d:
            r0 = 3
            goto L5f
        L3f:
            java.lang.String r6 = "HMACSHA256"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L48
            goto L29
        L48:
            r0 = r2
            goto L5f
        L4a:
            java.lang.String r6 = "HMACSHA224"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L53
            goto L29
        L53:
            r0 = 1
            goto L5f
        L55:
            java.lang.String r6 = "HMACSHA1"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L5e
            goto L29
        L5e:
            r0 = 0
        L5f:
            switch(r0) {
                case 0: goto L82;
                case 1: goto L7d;
                case 2: goto L78;
                case 3: goto L73;
                case 4: goto L6e;
                default: goto L62;
            }
        L62:
            java.security.NoSuchAlgorithmException r4 = new java.security.NoSuchAlgorithmException
            java.lang.String r6 = "unknown Hmac algorithm: "
            java.lang.String r5 = r6.concat(r5)
            r4.<init>(r5)
            throw r4
        L6e:
            r5 = 64
            r4.b = r5
            goto L86
        L73:
            r5 = 48
            r4.b = r5
            goto L86
        L78:
            r5 = 32
            r4.b = r5
            goto L86
        L7d:
            r5 = 28
            r4.b = r5
            goto L86
        L82:
            r5 = 20
            r4.b = r5
        L86:
            r1.get()
            return
        L8a:
            java.security.InvalidAlgorithmParameterException r4 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r5 = "key size too small, need at least 16 bytes"
            r4.<init>(r5)
            throw r4
        L92:
            java.lang.String r4 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            defpackage.hfd.j(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vdf.<init>(java.lang.String, javax.crypto.spec.SecretKeySpec):void");
    }

    public static synchronized vdf i(Context context) {
        vdf vdfVar;
        synchronized (vdf.class) {
            try {
                if (f == null) {
                    f = new vdf(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ux7("MessengerIpcClient"))));
                }
                vdfVar = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vdfVar;
    }

    @Override // defpackage.yr5
    public int a() {
        frb frbVar = (frb) this.d;
        if (frbVar != null) {
            return frbVar.c.length();
        }
        return ((mkc) this.c).f().d.length();
    }

    @Override // defpackage.yr5
    public long b(long j) {
        mkc mkcVar = (mkc) this.c;
        if (mkcVar.d == null && mkcVar.c == null) {
            return j;
        }
        return mkcVar.h(j);
    }

    @Override // defpackage.s9f
    public byte[] c(byte[] bArr, int i) {
        flf flfVar = (flf) this.c;
        if (i <= this.b) {
            ((Mac) flfVar.get()).update(bArr);
            return Arrays.copyOf(((Mac) flfVar.get()).doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }

    @Override // defpackage.yr5
    public long d(long j) {
        mkc mkcVar = (mkc) this.c;
        if (mkcVar.d == null && mkcVar.c == null) {
            return j;
        }
        return mkcVar.i(j);
    }

    public boolean e() {
        mkc mkcVar = (mkc) this.c;
        gw7 gw7Var = (gw7) this.e;
        int i = this.b - 1;
        this.b = i;
        if (i == 0 && gw7Var.c != 0) {
            dub dubVar = mkcVar.a;
            og0 og0Var = mkcVar.b;
            dubVar.b.a().k();
            frb frbVar = dubVar.b;
            if (mkcVar.d == null && mkcVar.c == null) {
                this.d = frbVar;
            }
            Object[] objArr = gw7Var.a;
            int i2 = gw7Var.c;
            for (int i3 = 0; i3 < i2; i3++) {
                ((xt4) objArr[i3]).invoke(frbVar);
            }
            mkcVar.o(frbVar);
            dub.a(dubVar, og0Var, false, wrb.a);
            dubVar.f(true);
            gw7Var.g();
        }
        if (this.b > 0) {
            return true;
        }
        return false;
    }

    public String f() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.d)[i2];
            if (obj instanceof o9a) {
                o9a o9aVar = (o9a) obj;
                boolean i3 = c16.i(o9aVar.e(), a5b.g);
                int[] iArr = (int[]) this.e;
                if (i3) {
                    if (iArr[i2] != -1) {
                        sb.append("[");
                        sb.append(((int[]) this.e)[i2]);
                        sb.append("]");
                    }
                } else {
                    int i4 = iArr[i2];
                    if (i4 >= 0) {
                        sb.append(".");
                        sb.append(o9aVar.g(i4));
                    }
                }
            } else if (obj == p40.C) {
                sb.append("[<debug info disabled>]");
            } else if (obj != zj1.f) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public int g() {
        int i = this.b;
        if (i != 2) {
            if (i != 3) {
                return 0;
            }
            return 512;
        }
        return 2048;
    }

    public void h() {
        int i = this.b * 2;
        this.d = Arrays.copyOf((Object[]) this.d, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        b00.Z(0, 0, 14, (int[]) this.e, iArr);
        this.e = iArr;
    }

    public synchronized Task j(e8f e8fVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(e8fVar.toString()));
            }
            if (!((r5f) this.e).a(e8fVar)) {
                r5f r5fVar = new r5f(this);
                this.e = r5fVar;
                r5fVar.a(e8fVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e8fVar.b.getTask();
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return f();
            default:
                return super.toString();
        }
    }

    public vdf(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.a = 0;
        this.e = new r5f(this);
        this.b = 1;
        this.d = scheduledExecutorService;
        this.c = context.getApplicationContext();
    }

    public vdf(a46 a46Var) {
        this.a = 2;
        this.c = a46Var;
        this.d = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.e = iArr;
        this.b = -1;
    }

    public vdf(mkc mkcVar) {
        this.a = 1;
        this.c = mkcVar;
        this.e = new gw7(new xt4[16], 0);
    }

    public vdf(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.a = 3;
        this.c = str;
        this.b = i2;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.d = unmodifiableList;
        this.e = bArr;
    }
}
