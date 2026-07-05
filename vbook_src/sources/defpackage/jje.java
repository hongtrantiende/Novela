package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jje  reason: default package */
/* loaded from: classes.dex */
public final class jje implements gn9, d0f, tpe {
    public static jje e;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public jje() {
        this.a = 8;
        this.b = new AtomicBoolean(false);
        new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.d0f, defpackage.tpe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r10, int r11, java.lang.Throwable r12, byte[] r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jje.a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    @Override // defpackage.gn9
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        uye uyeVar = (uye) ((wye) obj).l();
        ixe ixeVar = new ixe((iye) this.b, (k32) this.d);
        Parcel S = uyeVar.S();
        S.writeString((String) this.c);
        wbe.c(S, ixeVar);
        uyeVar.T(S, 28);
    }

    public File b() {
        String str = (String) ((c9b) this.c).get();
        String str2 = (String) ((c9b) this.d).get();
        return new File(nk2.w(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3), str, "/", str2, ".pb"));
    }

    public lje c() {
        xk9 xk9Var;
        hlf b;
        sje sjeVar = (sje) this.b;
        if (sjeVar != null && (xk9Var = (xk9) this.c) != null) {
            if (sjeVar.a == ((hlf) xk9Var.b).a.length) {
                if (sjeVar.a() && ((Integer) this.d) == null) {
                    hfd.j("Cannot create key without ID requirement with parameters with ID requirement");
                    return null;
                } else if (!((sje) this.b).a() && ((Integer) this.d) != null) {
                    hfd.j("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                } else {
                    oce oceVar = ((sje) this.b).b;
                    if (oceVar == oce.D) {
                        b = o5f.a;
                    } else if (oceVar == oce.C) {
                        b = o5f.a(((Integer) this.d).intValue());
                    } else if (oceVar == oce.f) {
                        b = o5f.b(((Integer) this.d).intValue());
                    } else {
                        vs.k("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(oceVar)));
                        return null;
                    }
                    return new lje((sje) this.b, (xk9) this.c, b, (Integer) this.d);
                }
            }
            hfd.j("Key size mismatch");
            return null;
        }
        hfd.j("Cannot build without parameters and/or key material");
        return null;
    }

    public uve d() {
        xk9 xk9Var;
        hlf b;
        lwe lweVar = (lwe) this.b;
        if (lweVar != null && (xk9Var = (xk9) this.c) != null) {
            if (lweVar.a == ((hlf) xk9Var.b).a.length) {
                if (lweVar.a() && ((Integer) this.d) == null) {
                    hfd.j("Cannot create key without ID requirement with parameters with ID requirement");
                    return null;
                } else if (!((lwe) this.b).a() && ((Integer) this.d) != null) {
                    hfd.j("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                } else {
                    jwe jweVar = ((lwe) this.b).b;
                    if (jweVar == jwe.d) {
                        b = o5f.a;
                    } else if (jweVar == jwe.c) {
                        b = o5f.a(((Integer) this.d).intValue());
                    } else if (jweVar == jwe.b) {
                        b = o5f.b(((Integer) this.d).intValue());
                    } else {
                        vs.k("Unknown AesSivParameters.Variant: ".concat(String.valueOf(jweVar)));
                        return null;
                    }
                    return new uve((lwe) this.b, (xk9) this.c, b, (Integer) this.d);
                }
            }
            hfd.j("Key size mismatch");
            return null;
        }
        vs.m("Cannot build without parameters and/or key material");
        return null;
    }

    public j7f e() {
        xk9 xk9Var;
        o7f o7fVar = (o7f) this.b;
        if (o7fVar != null && (xk9Var = (xk9) this.c) != null) {
            if (o7fVar.a == ((hlf) xk9Var.b).a.length) {
                if (o7fVar.a() && ((Integer) this.d) == null) {
                    hfd.j("Cannot create key without ID requirement with parameters with ID requirement");
                    return null;
                } else if (!((o7f) this.b).a() && ((Integer) this.d) != null) {
                    hfd.j("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                } else {
                    oce oceVar = ((o7f) this.b).c;
                    if (oceVar == oce.J) {
                        hlf hlfVar = o5f.a;
                    } else if (oceVar != oce.I && oceVar != oce.H) {
                        if (oceVar == oce.G) {
                            o5f.b(((Integer) this.d).intValue());
                        } else {
                            vs.k("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(oceVar)));
                            return null;
                        }
                    } else {
                        o5f.a(((Integer) this.d).intValue());
                    }
                    return new j7f((o7f) this.b, (xk9) this.c, (Integer) this.d);
                }
            }
            hfd.j("Key size mismatch");
            return null;
        }
        hfd.j("Cannot build without parameters and/or key material");
        return null;
    }

    public o7f f() {
        Integer num = (Integer) this.d;
        if (num != null) {
            if (((Integer) this.b) != null) {
                if (((oce) this.c) != null) {
                    return new o7f(num.intValue(), ((Integer) this.b).intValue(), (oce) this.c);
                }
                hfd.j("variant not set");
                return null;
            }
            hfd.j("tag size not set");
            return null;
        }
        hfd.j("key size not set");
        return null;
    }

    public r7f g() {
        xk9 xk9Var;
        h8f h8fVar = (h8f) this.b;
        if (h8fVar != null && (xk9Var = (xk9) this.c) != null) {
            if (h8fVar.a == ((hlf) xk9Var.b).a.length) {
                if (h8fVar.a() && ((Integer) this.d) == null) {
                    hfd.j("Cannot create key without ID requirement with parameters with ID requirement");
                    return null;
                } else if (!((h8f) this.b).a() && ((Integer) this.d) != null) {
                    hfd.j("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                } else {
                    f8f f8fVar = ((h8f) this.b).c;
                    if (f8fVar == f8f.e) {
                        hlf hlfVar = o5f.a;
                    } else if (f8fVar != f8f.d && f8fVar != f8f.c) {
                        if (f8fVar == f8f.b) {
                            o5f.b(((Integer) this.d).intValue());
                        } else {
                            vs.k("Unknown HmacParameters.Variant: ".concat(String.valueOf(f8fVar)));
                            return null;
                        }
                    } else {
                        o5f.a(((Integer) this.d).intValue());
                    }
                    return new r7f((h8f) this.b, (xk9) this.c, (Integer) this.d);
                }
            }
            hfd.j("Key size mismatch");
            return null;
        }
        hfd.j("Cannot build without parameters and/or key material");
        return null;
    }

    public void h(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i << 3)));
        }
        this.d = Integer.valueOf(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(defpackage.szd r10, java.util.Set r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jje.i(szd, java.util.Set, java.lang.String):void");
    }

    public void j(int i) {
        if (i >= 10 && 16 >= i) {
            this.b = Integer.valueOf(i);
            return;
        }
        throw new GeneralSecurityException(a82.j(i, "Invalid tag size for AesCmacParameters: "));
    }

    public synchronized void k(int i, int i2, long j, long j2) {
        ((lte) this.b).G.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.d;
        if (atomicLong.get() != -1 && elapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((xb4) this.c).c(new elb(0, Arrays.asList(new cc7(36301, i, 0, j, j2, null, null, 0, i2)))).addOnFailureListener(new zg1(this, elapsedRealtime, 6));
    }

    public /* synthetic */ jje(Object obj, Serializable serializable, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = serializable;
        this.d = obj2;
    }

    public /* synthetic */ jje(a6f a6fVar, String str, Object obj, int i) {
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = a6fVar;
    }

    public /* synthetic */ jje(int i) {
        this.a = i;
    }

    public jje(Context context, lte lteVar) {
        this.a = 1;
        this.d = new AtomicLong(-1L);
        this.c = new tz4(context, null, xb4.n, new flb("measurement:api"), sz4.c);
        this.b = lteVar;
    }

    public jje(final szd szdVar, final String str) {
        this.a = 7;
        this.b = nh0.d;
        this.c = kte.j(new c9b(this) { // from class: g2f
            public final /* synthetic */ jje b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // defpackage.c9b
            public final Object get() {
                long j;
                char c;
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long j7;
                int i = r3;
                Serializable serializable = szdVar;
                jje jjeVar = this.b;
                switch (i) {
                    case 0:
                        int i2 = f45.a;
                        int i3 = ou7.c;
                        nu7 c2 = new nu7().c(((String) serializable).getBytes());
                        ByteBuffer byteBuffer = c2.a;
                        byteBuffer.put((byte) 0);
                        if (byteBuffer.remaining() < 8) {
                            c2.a();
                        }
                        nu7 c3 = c2.c("".getBytes());
                        c3.a();
                        ByteBuffer byteBuffer2 = c3.a;
                        byteBuffer2.flip();
                        if (byteBuffer2.remaining() > 0) {
                            c3.f = byteBuffer2.remaining() + c3.f;
                            long j8 = 0;
                            switch (byteBuffer2.remaining()) {
                                case 1:
                                    j = 0;
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    break;
                                case 2:
                                    c = '\b';
                                    j2 = 0;
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    break;
                                case 3:
                                    c = '\b';
                                    j3 = 0;
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    break;
                                case 4:
                                    c = '\b';
                                    j4 = 0;
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    break;
                                case 5:
                                    c = '\b';
                                    j5 = 0;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & 255) << 32);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    break;
                                case 6:
                                    j6 = 0;
                                    c = '\b';
                                    j5 = ((byteBuffer2.get(5) & 255) << 40) ^ j6;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & 255) << 32);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    break;
                                case 7:
                                    j6 = (byteBuffer2.get(6) & 255) << 48;
                                    c = '\b';
                                    j5 = ((byteBuffer2.get(5) & 255) << 40) ^ j6;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & 255) << 32);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    break;
                                case 8:
                                    j7 = byteBuffer2.getLong();
                                    break;
                                case 9:
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    break;
                                case 10:
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    break;
                                case 11:
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    break;
                                case 12:
                                    j8 ^= (byteBuffer2.get(11) & 255) << 24;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    break;
                                case 13:
                                    j8 ^= (byteBuffer2.get(12) & 255) << 32;
                                    j8 ^= (byteBuffer2.get(11) & 255) << 24;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    break;
                                case 14:
                                    j8 ^= (byteBuffer2.get(13) & 255) << 40;
                                    j8 ^= (byteBuffer2.get(12) & 255) << 32;
                                    j8 ^= (byteBuffer2.get(11) & 255) << 24;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    break;
                                case 15:
                                    j8 = (byteBuffer2.get(14) & 255) << 48;
                                    j8 ^= (byteBuffer2.get(13) & 255) << 40;
                                    j8 ^= (byteBuffer2.get(12) & 255) << 32;
                                    j8 ^= (byteBuffer2.get(11) & 255) << 24;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    break;
                                default:
                                    vs.j("Should never get here.");
                                    return null;
                            }
                            c3.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.d;
                            c3.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                        }
                        long j9 = c3.d;
                        long j10 = c3.f;
                        long j11 = j9 ^ j10;
                        long j12 = j10 ^ c3.e;
                        long j13 = j11 + j12;
                        long j14 = j12 + j13;
                        long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                        long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
                        long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                        long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
                        long j19 = j18 ^ (j18 >>> 33);
                        long j20 = (j16 ^ (j16 >>> 33)) + j19;
                        c3.d = j20;
                        c3.e = j19 + j20;
                        byte[] array = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(c3.d).putLong(c3.e).array();
                        array.getClass();
                        return ((mh0) jjeVar.b).a((byte[]) array.clone());
                    default:
                        return ((mh0) jjeVar.b).a(((szd) serializable).j());
                }
            }
        });
        this.d = kte.j(new c9b(this) { // from class: g2f
            public final /* synthetic */ jje b;

            {
                this.b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // defpackage.c9b
            public final Object get() {
                long j;
                char c;
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long j7;
                int i = r3;
                Serializable serializable = str;
                jje jjeVar = this.b;
                switch (i) {
                    case 0:
                        int i2 = f45.a;
                        int i3 = ou7.c;
                        nu7 c2 = new nu7().c(((String) serializable).getBytes());
                        ByteBuffer byteBuffer = c2.a;
                        byteBuffer.put((byte) 0);
                        if (byteBuffer.remaining() < 8) {
                            c2.a();
                        }
                        nu7 c3 = c2.c("".getBytes());
                        c3.a();
                        ByteBuffer byteBuffer2 = c3.a;
                        byteBuffer2.flip();
                        if (byteBuffer2.remaining() > 0) {
                            c3.f = byteBuffer2.remaining() + c3.f;
                            long j8 = 0;
                            switch (byteBuffer2.remaining()) {
                                case 1:
                                    j = 0;
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    break;
                                case 2:
                                    c = '\b';
                                    j2 = 0;
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    break;
                                case 3:
                                    c = '\b';
                                    j3 = 0;
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    break;
                                case 4:
                                    c = '\b';
                                    j4 = 0;
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    break;
                                case 5:
                                    c = '\b';
                                    j5 = 0;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & 255) << 32);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    break;
                                case 6:
                                    j6 = 0;
                                    c = '\b';
                                    j5 = ((byteBuffer2.get(5) & 255) << 40) ^ j6;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & 255) << 32);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    break;
                                case 7:
                                    j6 = (byteBuffer2.get(6) & 255) << 48;
                                    c = '\b';
                                    j5 = ((byteBuffer2.get(5) & 255) << 40) ^ j6;
                                    j4 = j5 ^ ((byteBuffer2.get(4) & 255) << 32);
                                    j3 = j4 ^ ((byteBuffer2.get(3) & 255) << 24);
                                    j2 = j3 ^ ((byteBuffer2.get(2) & 255) << 16);
                                    j = j2 ^ ((byteBuffer2.get(1) & 255) << c);
                                    j7 = j ^ (byteBuffer2.get(0) & 255);
                                    break;
                                case 8:
                                    j7 = byteBuffer2.getLong();
                                    break;
                                case 9:
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    break;
                                case 10:
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    break;
                                case 11:
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    break;
                                case 12:
                                    j8 ^= (byteBuffer2.get(11) & 255) << 24;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    break;
                                case 13:
                                    j8 ^= (byteBuffer2.get(12) & 255) << 32;
                                    j8 ^= (byteBuffer2.get(11) & 255) << 24;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    break;
                                case 14:
                                    j8 ^= (byteBuffer2.get(13) & 255) << 40;
                                    j8 ^= (byteBuffer2.get(12) & 255) << 32;
                                    j8 ^= (byteBuffer2.get(11) & 255) << 24;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    break;
                                case 15:
                                    j8 = (byteBuffer2.get(14) & 255) << 48;
                                    j8 ^= (byteBuffer2.get(13) & 255) << 40;
                                    j8 ^= (byteBuffer2.get(12) & 255) << 32;
                                    j8 ^= (byteBuffer2.get(11) & 255) << 24;
                                    j8 ^= (byteBuffer2.get(10) & 255) << 16;
                                    j8 ^= (byteBuffer2.get(9) & 255) << 8;
                                    j8 ^= byteBuffer2.get(8) & 255;
                                    j7 = byteBuffer2.getLong();
                                    break;
                                default:
                                    vs.j("Should never get here.");
                                    return null;
                            }
                            c3.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c3.d;
                            c3.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                        }
                        long j9 = c3.d;
                        long j10 = c3.f;
                        long j11 = j9 ^ j10;
                        long j12 = j10 ^ c3.e;
                        long j13 = j11 + j12;
                        long j14 = j12 + j13;
                        long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
                        long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
                        long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
                        long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
                        long j19 = j18 ^ (j18 >>> 33);
                        long j20 = (j16 ^ (j16 >>> 33)) + j19;
                        c3.d = j20;
                        c3.e = j19 + j20;
                        byte[] array = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(c3.d).putLong(c3.e).array();
                        array.getClass();
                        return ((mh0) jjeVar.b).a((byte[]) array.clone());
                    default:
                        return ((mh0) jjeVar.b).a(((szd) serializable).j());
                }
            }
        });
    }
}
