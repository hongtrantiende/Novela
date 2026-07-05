package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import java.io.ByteArrayInputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceArray;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hvc  reason: default package */
/* loaded from: classes.dex */
public final class hvc implements rfd, m5a, OnCompleteListener, abe, Continuation, gn9, f1f, s9f, x00 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public hvc(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new gw7(new Reference[16], 0);
                this.c = new ReferenceQueue();
                return;
            case 10:
                this.b = new HashMap();
                this.c = new u9e(6);
                u9e u9eVar = new u9e(0);
                nbe nbeVar = nbe.BITWISE_AND;
                ArrayList arrayList = u9eVar.a;
                arrayList.add(nbeVar);
                arrayList.add(nbe.BITWISE_LEFT_SHIFT);
                arrayList.add(nbe.BITWISE_NOT);
                arrayList.add(nbe.BITWISE_OR);
                arrayList.add(nbe.BITWISE_RIGHT_SHIFT);
                arrayList.add(nbe.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(nbe.BITWISE_XOR);
                G(u9eVar);
                u9e u9eVar2 = new u9e(1);
                nbe nbeVar2 = nbe.EQUALS;
                ArrayList arrayList2 = u9eVar2.a;
                arrayList2.add(nbeVar2);
                arrayList2.add(nbe.GREATER_THAN);
                arrayList2.add(nbe.GREATER_THAN_EQUALS);
                arrayList2.add(nbe.IDENTITY_EQUALS);
                arrayList2.add(nbe.IDENTITY_NOT_EQUALS);
                arrayList2.add(nbe.LESS_THAN);
                arrayList2.add(nbe.LESS_THAN_EQUALS);
                arrayList2.add(nbe.NOT_EQUALS);
                G(u9eVar2);
                u9e u9eVar3 = new u9e(2);
                nbe nbeVar3 = nbe.APPLY;
                ArrayList arrayList3 = u9eVar3.a;
                arrayList3.add(nbeVar3);
                arrayList3.add(nbe.BLOCK);
                arrayList3.add(nbe.BREAK);
                arrayList3.add(nbe.CASE);
                arrayList3.add(nbe.DEFAULT);
                arrayList3.add(nbe.CONTINUE);
                arrayList3.add(nbe.DEFINE_FUNCTION);
                arrayList3.add(nbe.FN);
                arrayList3.add(nbe.IF);
                arrayList3.add(nbe.QUOTE);
                arrayList3.add(nbe.RETURN);
                arrayList3.add(nbe.SWITCH);
                arrayList3.add(nbe.TERNARY);
                G(u9eVar3);
                u9e u9eVar4 = new u9e(3);
                nbe nbeVar4 = nbe.AND;
                ArrayList arrayList4 = u9eVar4.a;
                arrayList4.add(nbeVar4);
                arrayList4.add(nbe.NOT);
                arrayList4.add(nbe.OR);
                G(u9eVar4);
                u9e u9eVar5 = new u9e(4);
                nbe nbeVar5 = nbe.FOR_IN;
                ArrayList arrayList5 = u9eVar5.a;
                arrayList5.add(nbeVar5);
                arrayList5.add(nbe.FOR_IN_CONST);
                arrayList5.add(nbe.FOR_IN_LET);
                arrayList5.add(nbe.FOR_LET);
                arrayList5.add(nbe.FOR_OF);
                arrayList5.add(nbe.FOR_OF_CONST);
                arrayList5.add(nbe.FOR_OF_LET);
                arrayList5.add(nbe.WHILE);
                G(u9eVar5);
                u9e u9eVar6 = new u9e(5);
                nbe nbeVar6 = nbe.ADD;
                ArrayList arrayList6 = u9eVar6.a;
                arrayList6.add(nbeVar6);
                arrayList6.add(nbe.DIVIDE);
                arrayList6.add(nbe.MODULUS);
                arrayList6.add(nbe.MULTIPLY);
                arrayList6.add(nbe.NEGATE);
                arrayList6.add(nbe.POST_DECREMENT);
                arrayList6.add(nbe.POST_INCREMENT);
                arrayList6.add(nbe.PRE_DECREMENT);
                arrayList6.add(nbe.PRE_INCREMENT);
                arrayList6.add(nbe.SUBTRACT);
                G(u9eVar6);
                u9e u9eVar7 = new u9e(7);
                nbe nbeVar7 = nbe.ASSIGN;
                ArrayList arrayList7 = u9eVar7.a;
                arrayList7.add(nbeVar7);
                arrayList7.add(nbe.CONST);
                arrayList7.add(nbe.CREATE_ARRAY);
                arrayList7.add(nbe.CREATE_OBJECT);
                arrayList7.add(nbe.EXPRESSION_LIST);
                arrayList7.add(nbe.GET);
                arrayList7.add(nbe.GET_INDEX);
                arrayList7.add(nbe.GET_PROPERTY);
                arrayList7.add(nbe.NULL);
                arrayList7.add(nbe.SET_PROPERTY);
                arrayList7.add(nbe.TYPEOF);
                arrayList7.add(nbe.UNDEFINED);
                arrayList7.add(nbe.VAR);
                G(u9eVar7);
                return;
            case 27:
                this.b = new TreeMap();
                this.c = new TreeMap();
                return;
            default:
                this.b = new jla(0);
                this.c = new my6((Object) null);
                return;
        }
    }

    public static boolean H(int i) {
        int i2 = xce.a[a82.C(i)];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return true;
        }
        return false;
    }

    public static t6f L(vgf vgfVar) {
        Integer valueOf;
        int t = vgfVar.t();
        if (vgfVar.B() == eif.RAW) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(t);
        }
        return t6f.p(vgfVar.y().A(), vgfVar.y().z(), vgfVar.y().x(), vgfVar.B(), valueOf);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [ejf, java.lang.Object] */
    public static final hvc m(k57 k57Var) {
        ogf ogfVar;
        int i;
        Integer num;
        bfe bfeVar = (bfe) k57Var.b;
        if (bfeVar == null) {
            try {
                if (bfeVar instanceof j4f) {
                    ogfVar = (ogf) ((j4f) bfeVar).a.b;
                } else {
                    ogfVar = (ogf) ((s6f) l5f.b.d(bfeVar)).b;
                }
                bfeVar = y9e.s(ogfVar.c());
            } catch (GeneralSecurityException e) {
                throw new gt1(15, "Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(String.valueOf(bfeVar)), e);
            }
        }
        ?? obj = new Object();
        obj.b = new ArrayList();
        obj.c = new HashMap();
        obj.a = false;
        ArrayList arrayList = (ArrayList) obj.b;
        qde qdeVar = new qde(bfeVar);
        hq7 hq7Var = hq7.U;
        qdeVar.c = hq7Var;
        qdeVar.a = true;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ((qde) obj2).a = false;
        }
        arrayList.add(qdeVar);
        if (!obj.a) {
            obj.a = true;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (int i3 = 0; i3 < arrayList.size() - 1; i3++) {
                if (((qde) arrayList.get(i3)).c == hq7Var && ((qde) arrayList.get(i3 + 1)).c != hq7Var) {
                    hfd.j("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                    return null;
                }
            }
            HashSet hashSet = new HashSet();
            int size2 = arrayList.size();
            int i4 = 0;
            Integer num2 = null;
            while (i4 < size2) {
                Object obj3 = arrayList.get(i4);
                i4++;
                qde qdeVar2 = (qde) obj3;
                qdeVar2.getClass();
                bfe bfeVar2 = qdeVar2.b;
                hq7 hq7Var2 = qdeVar2.c;
                if (hq7Var2 != null) {
                    if (hq7Var2 == hq7Var) {
                        int i5 = 0;
                        while (true) {
                            if (i5 != 0 && !hashSet.contains(Integer.valueOf(i5))) {
                                break;
                            }
                            Charset charset = k7f.a;
                            i5 = 0;
                            while (i5 == 0) {
                                byte[] a = u6f.a(4);
                                i5 = (a[3] & 255) | ((a[0] & 255) << 24) | ((a[1] & 255) << 16) | ((a[2] & 255) << 8);
                            }
                        }
                        i = i5;
                    } else {
                        i = 0;
                    }
                    if (!hashSet.contains(Integer.valueOf(i))) {
                        hashSet.add(Integer.valueOf(i));
                        if (bfeVar2.a()) {
                            num = Integer.valueOf(i);
                        } else {
                            num = null;
                        }
                        wde wdeVar = new wde(y4f.b.a(bfeVar2, num), 2, i, qdeVar2.a, false);
                        int i6 = i;
                        if (qdeVar2.a) {
                            if (num2 == null) {
                                num2 = Integer.valueOf(i6);
                            } else {
                                hfd.j("Two primaries were set");
                                return null;
                            }
                        }
                        arrayList2.add(wdeVar);
                    } else {
                        throw new GeneralSecurityException(hl5.l("Id ", " is used twice in the keyset", i));
                    }
                } else {
                    hfd.j("No ID was set (with withFixedId or withRandomId)");
                    return null;
                }
            }
            if (num2 != null) {
                hvc hvcVar = new hvc((HashMap) obj.c, arrayList2);
                hvcVar.B();
                return hvcVar;
            }
            hfd.j("No primary was set");
            return null;
        }
        hfd.j("KeysetHandle.Builder#build must only be called once");
        return null;
    }

    public static final hvc n(g99 g99Var, n2f n2fVar, byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) g99Var.b;
        try {
            g7e g7eVar = g7e.a;
            hef t = hef.t(byteArrayInputStream, g7eVar);
            byteArrayInputStream.close();
            if (t.x().b() != 0) {
                try {
                    xgf w = xgf.w(n2fVar.a(t.x().m(), bArr), g7eVar);
                    if (w != null && w.t() > 0) {
                        return o(w);
                    }
                    throw new GeneralSecurityException("empty keyset");
                } catch (w7e unused) {
                    hfd.j("invalid keyset, corrupted key material");
                    return null;
                }
            }
            hfd.j("empty keyset");
            return null;
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static final hvc o(xgf xgfVar) {
        s9e c4fVar;
        boolean z;
        boolean z2;
        int i;
        s9e s9eVar;
        if (xgfVar.t() > 0) {
            ArrayList arrayList = new ArrayList(xgfVar.t());
            for (vgf vgfVar : xgfVar.B()) {
                int t = vgfVar.t();
                try {
                    c4fVar = v(vgfVar);
                    z = false;
                } catch (GeneralSecurityException e) {
                    if (!bve.a.a.get()) {
                        c4fVar = new c4f(L(vgfVar));
                        z = true;
                    } else {
                        throw e;
                    }
                }
                if (bve.a.a.get() && !H(vgfVar.z())) {
                    hfd.j("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
                    return null;
                }
                int z3 = vgfVar.z();
                if (t == xgfVar.z()) {
                    z2 = true;
                    s9eVar = c4fVar;
                    i = z3;
                } else {
                    z2 = false;
                    i = z3;
                    s9eVar = c4fVar;
                }
                arrayList.add(new wde(s9eVar, i, t, z2, z));
            }
            return new hvc(new HashMap(), Collections.unmodifiableList(arrayList));
        }
        hfd.j("empty keyset");
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, skf] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, skf] */
    public static f0e u(qf4 qf4Var, x3e x3eVar) {
        Uri uri;
        Uri uri2;
        am8.s(qf4Var);
        am8.s(x3eVar);
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        am8.p("firebase");
        String str = x3eVar.a;
        am8.p(str);
        obj.a = str;
        obj.b = "firebase";
        obj.f = x3eVar.b;
        obj.c = x3eVar.d;
        if (!TextUtils.isEmpty(x3eVar.e)) {
            uri = Uri.parse(x3eVar.e);
        } else {
            uri = null;
        }
        if (uri != null) {
            obj.d = uri.toString();
            obj.e = uri;
        }
        obj.D = x3eVar.c;
        obj.E = null;
        obj.C = x3eVar.g;
        arrayList.add(obj);
        List list = x3eVar.f.a;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                v4e v4eVar = (v4e) list.get(i);
                ?? obj2 = new Object();
                am8.s(v4eVar);
                obj2.a = v4eVar.a;
                String str2 = v4eVar.d;
                am8.p(str2);
                obj2.b = str2;
                obj2.c = v4eVar.b;
                String str3 = v4eVar.c;
                if (!TextUtils.isEmpty(str3)) {
                    uri2 = Uri.parse(str3);
                } else {
                    uri2 = null;
                }
                if (uri2 != null) {
                    obj2.d = uri2.toString();
                    obj2.e = uri2;
                }
                obj2.f = v4eVar.g;
                obj2.C = v4eVar.f;
                obj2.D = false;
                obj2.E = v4eVar.e;
                arrayList.add(obj2);
            }
        }
        f0e f0eVar = new f0e(qf4Var, arrayList);
        f0eVar.E = new y1e(x3eVar.i, x3eVar.h);
        f0eVar.F = x3eVar.j;
        f0eVar.G = x3eVar.k;
        f0eVar.f(z1d.O(x3eVar.l));
        List list2 = x3eVar.m;
        if (list2 == null) {
            list2 = new ArrayList();
        }
        f0eVar.I = list2;
        return f0eVar;
    }

    public static s9e v(vgf vgfVar) {
        t6f L = L(vgfVar);
        l5f l5fVar = l5f.b;
        c7f c7fVar = (c7f) l5fVar.a.get();
        c7fVar.getClass();
        if (!c7fVar.b.containsKey(new f7f(t6f.class, (hlf) L.d))) {
            return new c4f(L);
        }
        return l5fVar.a(L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c3f, java.lang.Object] */
    public static c3f z() {
        ?? obj = new Object();
        obj.a = new HashMap();
        obj.b = new HashMap();
        return obj;
    }

    public l4f A(int i, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.b;
        l4f l4fVar = (l4f) atomicReferenceArray.get(i);
        if (l4fVar == null) {
            r3f t = ((xk9) this.c).t(str, z);
            while (!atomicReferenceArray.compareAndSet(i, null, t)) {
                if (atomicReferenceArray.get(i) != null) {
                    l4f l4fVar2 = (l4f) atomicReferenceArray.get(i);
                    l4fVar2.getClass();
                    return l4fVar2;
                }
            }
            return t;
        }
        return l4fVar;
    }

    public void B() {
        if (((Map) this.c).get(n4f.class) == null) {
            return;
        }
        vm1.h();
    }

    public void C(int i) {
        switch (this.a) {
            case 14:
                if (i != 16 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.b = Integer.valueOf(i);
                return;
            default:
                if (i != 32 && i != 48 && i != 64) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i)));
                }
                this.b = Integer.valueOf(i);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(defpackage.l97 r6) {
        /*
            r5 = this;
            xgf r5 = r5.P()
            v7e r0 = r5.B()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r0.next()
            vgf r1 = (defpackage.vgf) r1
            hgf r3 = r1.y()
            int r3 = r3.x()
            r4 = 1
            if (r3 == r4) goto L3b
            hgf r3 = r1.y()
            int r3 = r3.x()
            r4 = 2
            if (r3 == r4) goto L3b
            hgf r3 = r1.y()
            int r3 = r3.x()
            r4 = 3
            if (r3 == r4) goto L3b
            goto Lc
        L3b:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            hgf r6 = r1.y()
            int r6 = r6.x()
            switch(r6) {
                case 1: goto L58;
                case 2: goto L55;
                case 3: goto L52;
                case 4: goto L4f;
                case 5: goto L4c;
                case 6: goto L49;
                default: goto L48;
            }
        L48:
            throw r2
        L49:
            java.lang.String r6 = "UNRECOGNIZED"
            goto L5a
        L4c:
            java.lang.String r6 = "REMOTE"
            goto L5a
        L4f:
            java.lang.String r6 = "ASYMMETRIC_PUBLIC"
            goto L5a
        L52:
            java.lang.String r6 = "ASYMMETRIC_PRIVATE"
            goto L5a
        L55:
            java.lang.String r6 = "SYMMETRIC"
            goto L5a
        L58:
            java.lang.String r6 = "UNKNOWN_KEYMATERIAL"
        L5a:
            hgf r0 = r1.y()
            java.lang.String r0 = r0.A()
            java.lang.String r1 = "keyset contains key material of type "
            java.lang.String r2 = " for type url "
            java.lang.String r6 = defpackage.eub.p(r1, r6, r2, r0)
            r5.<init>(r6)
            throw r5
        L6e:
            java.lang.Object r6 = r6.a
            java.io.ByteArrayOutputStream r6 = (java.io.ByteArrayOutputStream) r6
            m7e r5 = (defpackage.m7e) r5     // Catch: java.lang.Throwable -> L92
            int r0 = r5.a(r2)     // Catch: java.lang.Throwable -> L92
            boolean r1 = defpackage.e7e.b     // Catch: java.lang.Throwable -> L92
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 <= r1) goto L7f
            r0 = r1
        L7f:
            f7e r1 = new f7e     // Catch: java.lang.Throwable -> L92
            r1.<init>(r6, r0)     // Catch: java.lang.Throwable -> L92
            r5.k(r1)     // Catch: java.lang.Throwable -> L92
            int r5 = r1.e     // Catch: java.lang.Throwable -> L92
            if (r5 <= 0) goto L8e
            r1.v()     // Catch: java.lang.Throwable -> L92
        L8e:
            r6.close()
            return
        L92:
            r5 = move-exception
            r6.close()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvc.D(l97):void");
    }

    public void E(rwa rwaVar, n2f n2fVar, byte[] bArr) {
        xgf P = P();
        byte[] b = n2fVar.b(P.c(), bArr);
        fef w = hef.w();
        w6e e = s6e.e(b, 0, b.length);
        w.c();
        hef.u((hef) w.b, e);
        chf a = xfe.a(P);
        w.c();
        hef.v((hef) w.b, a);
        if (((SharedPreferences.Editor) rwaVar.b).putString((String) rwaVar.c, lre.o(((hef) w.b()).c())).commit()) {
            return;
        }
        fb4.k("Failed to write to SharedPreferences");
    }

    public void F(Object obj, Status status) {
        String str;
        e60 yf4Var;
        p1e p1eVar = (p1e) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        am8.t(taskCompletionSource, "completion source cannot be null");
        if (status != null) {
            if (p1eVar.k != null) {
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(p1eVar.c);
                yb3 yb3Var = p1eVar.k;
                if (!"reauthenticateWithCredential".equals(p1eVar.a())) {
                    "reauthenticateWithCredentialWithData".equals(p1eVar.a());
                }
                SparseArray sparseArray = u0e.a;
                firebaseAuth.getClass();
                yb3Var.getClass();
                Pair pair = (Pair) u0e.a.get(17078);
                String str2 = (String) pair.first;
                String str3 = (String) pair.second;
                List list = yb3Var.b;
                ArrayList O = z1d.O(list);
                ArrayList arrayList = new ArrayList();
                int size = O.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = O.get(i2);
                    i2++;
                    et7 et7Var = (et7) obj2;
                    if (et7Var instanceof su8) {
                        arrayList.add((su8) et7Var);
                    }
                }
                ArrayList O2 = z1d.O(list);
                ArrayList arrayList2 = new ArrayList();
                int size2 = O2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj3 = O2.get(i3);
                    i3++;
                    et7 et7Var2 = (et7) obj3;
                    if (et7Var2 instanceof iic) {
                        arrayList2.add((iic) et7Var2);
                    }
                }
                ArrayList O3 = z1d.O(list);
                am8.p(yb3Var.a);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int size3 = O3.size();
                while (i < size3) {
                    Object obj4 = O3.get(i);
                    i++;
                    et7 et7Var3 = (et7) obj4;
                    if (et7Var3 instanceof su8) {
                        arrayList3.add((su8) et7Var3);
                    } else if (et7Var3 instanceof iic) {
                        arrayList4.add((iic) et7Var3);
                    } else {
                        vs.m("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: ".concat(et7Var3.c()));
                        return;
                    }
                }
                qf4 qf4Var = firebaseAuth.a;
                qf4Var.a();
                am8.p(qf4Var.b);
                taskCompletionSource.setException(new yf4(str2, str3));
                return;
            } else if (p1eVar.j != null) {
                SparseArray sparseArray2 = u0e.a;
                int i4 = status.a;
                if (i4 != 17012 && i4 != 17007 && i4 != 17025) {
                    yf4Var = u0e.a(status);
                } else {
                    Pair pair2 = (Pair) u0e.a.get(i4);
                    if (pair2 != null) {
                        str = (String) pair2.second;
                    } else {
                        str = "An internal error has occurred.";
                    }
                    yf4Var = new yf4(u0e.b(i4), u0e.c(str, status));
                }
                taskCompletionSource.setException(yf4Var);
                return;
            } else {
                taskCompletionSource.setException(u0e.a(status));
                return;
            }
        }
        taskCompletionSource.setResult(obj);
    }

    public void G(u9e u9eVar) {
        ArrayList arrayList = u9eVar.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((HashMap) this.b).put(Integer.valueOf(((nbe) obj).a).toString(), u9eVar);
        }
    }

    public hvc I() {
        s9e c4fVar;
        boolean z;
        boolean z2;
        wde wdeVar;
        xgf P = P();
        List<wde> list = (List) this.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (wde wdeVar2 : list) {
            if (wdeVar2.a() instanceof uze) {
                s9e D = ((uze) wdeVar2.a()).D();
                wdeVar = new wde(D, wdeVar2.b, wdeVar2.d, wdeVar2.e, false);
                int i2 = wdeVar2.d;
                Integer C = D.C();
                if (C != null && C.intValue() != i2) {
                    hfd.j("Wrong ID set for key with ID requirement");
                    return null;
                }
            } else {
                vgf u = P.u(i);
                hgf y = u.y();
                if (y.x() == 3) {
                    String A = y.A();
                    s6e z3 = y.z();
                    int i3 = kfe.a;
                    u3f a = h3f.d.a(A);
                    if (a instanceof e4f) {
                        e4f e4fVar = (e4f) a;
                        t6f p = t6f.p(e4fVar.a, z3, e4fVar.b, eif.RAW, null);
                        l5f l5fVar = l5f.b;
                        s9e a2 = l5fVar.a(p);
                        if (a2 instanceof uze) {
                            t6f t6fVar = (t6f) l5fVar.c(((uze) a2).D());
                            fgf t = hgf.t();
                            t.c();
                            hgf.v((hgf) t.b, (String) t6fVar.c);
                            t.c();
                            hgf.w((hgf) t.b, (s6e) t6fVar.e);
                            int i4 = t6fVar.b;
                            t.c();
                            hgf.u((hgf) t.b, i4);
                            hgf hgfVar = (hgf) t.b();
                            l7e l7eVar = (l7e) u.d(5);
                            if (!l7eVar.a.equals(u)) {
                                if (!l7eVar.b.s()) {
                                    l7eVar.d();
                                }
                                l7e.a(l7eVar.b, u);
                            }
                            ugf ugfVar = (ugf) l7eVar;
                            ugfVar.c();
                            vgf.v((vgf) ugfVar.b, hgfVar);
                            vgf vgfVar = (vgf) ugfVar.b();
                            try {
                                c4fVar = v(vgfVar);
                                z = false;
                            } catch (GeneralSecurityException e) {
                                if (!bve.a.a.get()) {
                                    c4fVar = new c4f(L(vgfVar));
                                    z = true;
                                } else {
                                    throw e;
                                }
                            }
                            s9e s9eVar = c4fVar;
                            int t2 = vgfVar.t();
                            int i5 = wdeVar2.b;
                            if (t2 == P.z()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            wdeVar = new wde(s9eVar, i5, t2, z2, z);
                        } else {
                            hfd.j("Key not private key");
                            return null;
                        }
                    } else {
                        throw new GeneralSecurityException(hl5.n("manager for key type ", A, " is not a PrivateKeyManager"));
                    }
                } else {
                    hfd.j("The keyset contains a non-private key");
                    return null;
                }
            }
            arrayList.add(wdeVar);
            i++;
        }
        hvc hvcVar = new hvc((Map) this.c, arrayList);
        hvcVar.B();
        return hvcVar;
    }

    public e9e J(odd oddVar, e9e e9eVar) {
        u9e u9eVar;
        yae.U(oddVar);
        if (e9eVar instanceof j9e) {
            j9e j9eVar = (j9e) e9eVar;
            ArrayList arrayList = j9eVar.b;
            String str = j9eVar.a;
            HashMap hashMap = (HashMap) this.b;
            if (hashMap.containsKey(str)) {
                u9eVar = (u9e) hashMap.get(str);
            } else {
                u9eVar = (u9e) this.c;
            }
            return u9eVar.a(str, oddVar, arrayList);
        }
        return e9eVar;
    }

    public l4f K(String str, long j, int i) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.b;
        l4f l4fVar = (l4f) atomicReferenceArray.get(i);
        if (l4fVar == null) {
            d4f d4fVar = new d4f(str, (k32) ((xk9) this.c).b, j);
            while (!atomicReferenceArray.compareAndSet(i, null, d4fVar)) {
                if (atomicReferenceArray.get(i) != null) {
                    l4f l4fVar2 = (l4f) atomicReferenceArray.get(i);
                    l4fVar2.getClass();
                    return l4fVar2;
                }
            }
            return d4fVar;
        }
        return l4fVar;
    }

    public void M(odd oddVar, yx9 yx9Var) {
        int i;
        ize izeVar = new ize(yx9Var);
        TreeMap treeMap = (TreeMap) this.b;
        for (Integer num : treeMap.keySet()) {
            hxd clone = ((hxd) yx9Var.c).clone();
            e9e g = ((q8e) treeMap.get(num)).g(oddVar, Collections.singletonList(izeVar));
            if (g instanceof g4e) {
                i = yae.Q(((g4e) g).a.doubleValue());
            } else {
                i = -1;
            }
            if (i == 2 || i == -1) {
                yx9Var.c = clone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.c;
        for (Integer num2 : treeMap2.keySet()) {
            e9e g2 = ((q8e) treeMap2.get(num2)).g(oddVar, Collections.singletonList(izeVar));
            if (g2 instanceof g4e) {
                yae.Q(((g4e) g2).a.doubleValue());
            }
        }
    }

    public wde N() {
        for (wde wdeVar : (List) this.b) {
            if (wdeVar != null && wdeVar.e) {
                if (wdeVar.c == oce.c) {
                    return wdeVar;
                }
                vs.k("Keyset has primary which isn't enabled");
                return null;
            }
        }
        vs.k("Keyset has no valid primary");
        return null;
    }

    public l4f O(String str, String str2, int i) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.b;
        l4f l4fVar = (l4f) atomicReferenceArray.get(i);
        if (l4fVar == null) {
            h4f h4fVar = new h4f(str, (k32) ((xk9) this.c).b, str2);
            while (!atomicReferenceArray.compareAndSet(i, null, h4fVar)) {
                if (atomicReferenceArray.get(i) != null) {
                    l4f l4fVar2 = (l4f) atomicReferenceArray.get(i);
                    l4fVar2.getClass();
                    return l4fVar2;
                }
            }
            return h4fVar;
        }
        return l4fVar;
    }

    public xgf P() {
        try {
            wgf A = xgf.A();
            for (wde wdeVar : (List) this.b) {
                s9e a = wdeVar.a();
                int i = wdeVar.d;
                int i2 = wdeVar.b;
                t6f t6fVar = (t6f) l5f.b.c(a);
                Integer C = a.C();
                if (C != null && C.intValue() != i) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                ugf A2 = vgf.A();
                fgf t = hgf.t();
                t.c();
                hgf.v((hgf) t.b, (String) t6fVar.c);
                t.c();
                hgf.w((hgf) t.b, (s6e) t6fVar.e);
                int i3 = t6fVar.b;
                t.c();
                hgf.u((hgf) t.b, i3);
                A2.c();
                vgf.v((vgf) A2.b, (hgf) t.b());
                A2.c();
                vgf.x((vgf) A2.b, i2);
                A2.c();
                vgf.u((vgf) A2.b, i);
                A2.c();
                vgf.w((vgf) A2.b, (eif) t6fVar.f);
                A.c();
                xgf.y((xgf) A.b, (vgf) A2.b());
                if (wdeVar.e) {
                    A.c();
                    xgf.x((xgf) A.b, i);
                }
            }
            return (xgf) A.b();
        } catch (GeneralSecurityException e) {
            throw new gt1(15, e);
        }
    }

    @Override // defpackage.m5a
    public int a(int i) {
        CharSequence charSequence = (CharSequence) this.b;
        do {
            i = ((mld) this.c).j(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.gn9
    public void accept(Object obj, Object obj2) {
        int i;
        xb4 xb4Var = (xb4) this.b;
        rge rgeVar = (rge) obj;
        uke ukeVar = new uke(xb4Var, (TaskCompletionSource) obj2);
        Context context = xb4Var.a;
        try {
            i = wnd.a(context).b(0, context.getPackageName()).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = 0;
        }
        lm9 lm9Var = (lm9) this.c;
        lm9Var.f = i;
        yie yieVar = (yie) rgeVar.l();
        mt1 mt1Var = new mt1(-1, -1, 0, true);
        Parcelable.Creator<kv> creator = kv.CREATOR;
        kv kvVar = new kv(mt1Var, false);
        kvVar.c = false;
        boolean z = kvVar.c;
        kv kvVar2 = new kv(kvVar.a, true);
        kvVar2.c = z;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        int i2 = kde.a;
        obtain.writeStrongBinder(ukeVar);
        obtain.writeInt(1);
        lm9Var.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        kvVar2.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            yieVar.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // defpackage.m5a
    public int b(int i) {
        do {
            i = ((mld) this.c).k(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.s9f
    public byte[] c(byte[] bArr, int i) {
        switch (this.a) {
            case 25:
                if (i <= 16) {
                    Mac mac = Mac.getInstance("AESCMAC", (Provider) this.c);
                    mac.init((SecretKeySpec) this.b);
                    byte[] doFinal = mac.doFinal(bArr);
                    if (i != doFinal.length) {
                        return Arrays.copyOf(doFinal, i);
                    }
                    return doFinal;
                }
                throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
            default:
                if (bArr.length <= 64) {
                    return ((v9f) this.b).c(bArr, i);
                }
                return ((hvc) this.c).c(bArr, i);
        }
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [x1, java.lang.Object] */
    @Override // defpackage.x00
    public ListenableFuture call() {
        bcf bcfVar = (bcf) this.c;
        String valueOf = String.valueOf(bcfVar.a);
        bl8 bl8Var = bcfVar.h;
        String concat = "Initialize ".concat(valueOf);
        bl8Var.getClass();
        dgf f = bl8.f(concat);
        try {
            synchronized (bcfVar.g) {
                if (((List) this.b) == null) {
                    this.b = bcfVar.i;
                    bcfVar.i = Collections.EMPTY_LIST;
                }
            }
            ArrayList arrayList = new ArrayList(((List) this.b).size());
            ldf ldfVar = new ldf((bcf) this.c);
            for (c10 c10Var : (List) this.b) {
                try {
                    arrayList.add(c10Var.apply(ldfVar));
                } catch (Exception e) {
                    ?? obj = new Object();
                    obj.m(e);
                    arrayList.add(obj);
                }
            }
            qs5 k = qs5.k(arrayList);
            iq7 iq7Var = new iq7(this, 5);
            lo1 lo1Var = new lo1(k, true);
            lo1Var.J = new ko1(lo1Var, iq7Var);
            lo1Var.s();
            f.o(lo1Var);
            f.close();
            return lo1Var;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.m5a
    public int d(int i) {
        do {
            i = ((mld) this.c).k(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i)));
        return i;
    }

    @Override // defpackage.m5a
    public int e(int i) {
        do {
            i = ((mld) this.c).j(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.abe
    public odd f(e9e e9eVar) {
        odd v = ((odd) this.b).v();
        v.A((String) this.c, e9eVar);
        return v;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    @Override // defpackage.rfd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(defpackage.vyc r5, java.lang.String r6, defpackage.n42 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ugd
            if (r0 == 0) goto L13
            r0 = r7
            ugd r0 = (defpackage.ugd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ugd r0 = new ugd
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r7)
            goto L60
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r7)
            java.lang.String r5 = r5.C
            android.content.Intent r7 = new android.content.Intent
            java.lang.Object r1 = r4.b
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<org.publicvalue.multiplatform.oidc.appsupport.HandleRedirectActivity> r3 = org.publicvalue.multiplatform.oidc.appsupport.HandleRedirectActivity.class
            r7.<init>(r1, r3)
            java.lang.String r1 = "url"
            r7.putExtra(r1, r5)
            java.lang.String r5 = "usewebview"
            r7.putExtra(r5, r2)
            java.lang.String r5 = "redirecturl"
            r7.putExtra(r5, r6)
            java.lang.String r5 = "ephemeral_session"
            r6 = 0
            r7.putExtra(r5, r6)
            java.lang.Object r4 = r4.c
            k6 r4 = (defpackage.k6) r4
            r0.c = r2
            java.lang.Object r7 = r4.c(r7, r0)
            n82 r4 = defpackage.n82.a
            if (r7 != r4) goto L60
            return r4
        L60:
            z5 r7 = (defpackage.z5) r7
            ufd r4 = defpackage.ape.x(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvc.g(vyc, java.lang.String, n42):java.lang.Object");
    }

    @Override // defpackage.f1f
    public byte[] h(byte[] bArr, hvc hvcVar) {
        byte[] a = ((c2f) this.c).a(((hlf) hvcVar.b).b(), bArr);
        byte[] H = yqe.H(bArr, ((hlf) hvcVar.c).b());
        byte[] H2 = yqe.H(t1f.m, t1f.b);
        fje fjeVar = (fje) this.b;
        int macLength = Mac.getInstance(fjeVar.b).getMacLength();
        byte[] bArr2 = t1f.o;
        Charset charset = k7f.a;
        return fjeVar.d(macLength, fjeVar.e(yqe.H(bArr2, H2, "eae_prk".getBytes(charset), a), null), yqe.H(t1f.b(2, macLength), bArr2, H2, "shared_secret".getBytes(charset), H));
    }

    public void i(rl9 rl9Var, vf9 vf9Var) {
        jla jlaVar = (jla) this.b;
        ycd ycdVar = (ycd) jlaVar.get(rl9Var);
        if (ycdVar == null) {
            ycdVar = ycd.a();
            jlaVar.put(rl9Var, ycdVar);
        }
        ycdVar.c = vf9Var;
        ycdVar.a |= 8;
    }

    public vf9 j(rl9 rl9Var, int i) {
        ycd ycdVar;
        vf9 vf9Var;
        jla jlaVar = (jla) this.b;
        int c = jlaVar.c(rl9Var);
        if (c >= 0 && (ycdVar = (ycd) jlaVar.h(c)) != null) {
            int i2 = ycdVar.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                ycdVar.a = i3;
                if (i == 4) {
                    vf9Var = ycdVar.b;
                } else if (i == 8) {
                    vf9Var = ycdVar.c;
                } else {
                    vs.m("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    jlaVar.f(c);
                    ycdVar.a = 0;
                    ycdVar.b = null;
                    ycdVar.c = null;
                    ycd.d.l(ycdVar);
                }
                return vf9Var;
            }
        }
        return null;
    }

    public void k(rl9 rl9Var) {
        ycd ycdVar = (ycd) ((jla) this.b).get(rl9Var);
        if (ycdVar == null) {
            return;
        }
        ycdVar.a &= -2;
    }

    public void l(rl9 rl9Var) {
        my6 my6Var = (my6) this.c;
        int f = my6Var.f() - 1;
        while (true) {
            if (f < 0) {
                break;
            } else if (rl9Var == my6Var.g(f)) {
                Object[] objArr = my6Var.c;
                Object obj = objArr[f];
                Object obj2 = zr1.e;
                if (obj != obj2) {
                    objArr[f] = obj2;
                    my6Var.a = true;
                }
            } else {
                f--;
            }
        }
        ycd ycdVar = (ycd) ((jla) this.b).remove(rl9Var);
        if (ycdVar != null) {
            ycdVar.a = 0;
            ycdVar.b = null;
            ycdVar.c = null;
            ycd.d.l(ycdVar);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 5:
                jtd jtdVar = (jtd) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                synchronized (jtdVar.f) {
                    jtdVar.e.remove(taskCompletionSource);
                }
                return;
            case 6:
            default:
                GenericIdpActivity genericIdpActivity = (GenericIdpActivity) this.b;
                String str = (String) this.c;
                int i = GenericIdpActivity.Y;
                if (genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
                    List<ResolveInfo> queryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        kw5 a = new le2().a();
                        Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
                        Intent intent = (Intent) a.b;
                        intent.setData((Uri) task.getResult());
                        genericIdpActivity.startActivity(intent, (Bundle) a.c);
                        return;
                    }
                    Intent intent2 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                    intent2.putExtra("com.android.browser.application_id", str);
                    Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                    intent2.addFlags(1073741824);
                    intent2.addFlags(268435456);
                    genericIdpActivity.startActivity(intent2);
                    return;
                }
                Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                genericIdpActivity.q();
                return;
            case 7:
                ((Map) ((rwa) this.c).c).remove((TaskCompletionSource) this.b);
                return;
        }
    }

    public Task p(qf4 qf4Var, f0e f0eVar, c70 c70Var, String str, gee geeVar) {
        am8.s(qf4Var);
        am8.s(c70Var);
        am8.s(geeVar);
        ArrayList arrayList = f0eVar.f;
        if (arrayList != null && arrayList.contains(c70Var.c())) {
            return Tasks.forException(u0e.a(new Status(17015, null, null, null)));
        }
        if (c70Var instanceof kp3) {
            kp3 kp3Var = (kp3) c70Var;
            if (TextUtils.isEmpty(kp3Var.c)) {
                nzd nzdVar = new nzd(kp3Var, str);
                nzdVar.c = qf4Var;
                nzdVar.d = f0eVar;
                nzdVar.e = geeVar;
                nzdVar.f = geeVar;
                return q(nzdVar);
            }
            mzd mzdVar = new mzd(kp3Var);
            mzdVar.c = qf4Var;
            mzdVar.d = f0eVar;
            mzdVar.e = geeVar;
            mzdVar.f = geeVar;
            return q(mzdVar);
        } else if (c70Var instanceof ru8) {
            g2e.a.clear();
            mzd mzdVar2 = new mzd((ru8) c70Var);
            mzdVar2.c = qf4Var;
            mzdVar2.d = f0eVar;
            mzdVar2.e = geeVar;
            mzdVar2.f = geeVar;
            return q(mzdVar2);
        } else {
            pzd pzdVar = new pzd(c70Var);
            pzdVar.c = qf4Var;
            pzdVar.d = f0eVar;
            pzdVar.e = geeVar;
            pzdVar.f = geeVar;
            return q(pzdVar);
        }
    }

    public Task q(p1e p1eVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        gp9 gp9Var = new gp9(2);
        gp9Var.b = this;
        gp9Var.d = p1eVar;
        gp9Var.c = taskCompletionSource;
        ((Executor) this.c).execute(gp9Var);
        return taskCompletionSource.getTask();
    }

    public Enum r(Object obj) {
        Enum r1 = (Enum) ((Map) this.c).get(obj);
        if (r1 != null) {
            return r1;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public Object s(v28 v28Var, Class cls) {
        Object obj;
        hlf D;
        List arrayList;
        String str;
        int i;
        int i2;
        hce c1fVar;
        hlf D2;
        List arrayList2;
        List list = (List) this.b;
        xgf P = P();
        int i3 = xfe.a;
        int z = P.z();
        Iterator it = P.B().iterator();
        int i4 = 0;
        boolean z2 = true;
        int i5 = 0;
        boolean z3 = false;
        while (true) {
            Object obj2 = null;
            if (it.hasNext()) {
                vgf vgfVar = (vgf) it.next();
                if (vgfVar.z() == 2) {
                    if (vgfVar.C()) {
                        if (vgfVar.B() != eif.UNKNOWN_PREFIX) {
                            if (vgfVar.z() != 1) {
                                if (vgfVar.t() == z) {
                                    if (!z3) {
                                        z3 = true;
                                    } else {
                                        hfd.j("keyset contains multiple primary keys");
                                        return null;
                                    }
                                }
                                if (vgfVar.y().x() != 4) {
                                    z2 = false;
                                }
                                i5++;
                            } else {
                                throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(vgfVar.t())));
                            }
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(vgfVar.t())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(vgfVar.t())));
                    }
                }
            } else if (i5 != 0) {
                if (!z3 && !z2) {
                    hfd.j("keyset doesn't contain a valid primary key");
                    return null;
                }
                for (int i6 = 0; i6 < list.size(); i6++) {
                    if (((wde) list.get(i6)).f || !H(((wde) list.get(i6)).b)) {
                        throw new GeneralSecurityException("Key parsing of key with index " + i6 + " and type_url " + P.u(i6).y().A() + " failed, unable to get primitive");
                    }
                }
                String str2 = "PrefixMap only supports 0 and 5 byte prefixes";
                switch (v28Var.a) {
                    case 15:
                        obj = null;
                        if (cls == sbe.class) {
                            tw8 tw8Var = new tw8(14);
                            HashMap hashMap = new HashMap();
                            for (int i7 = 0; i7 < ((List) this.b).size(); i7++) {
                                wde w = w(i7);
                                if (w.c.equals(oce.c)) {
                                    s9e a = w.a();
                                    if (a instanceof ehe) {
                                        D = ((ehe) a).D();
                                    } else if (a instanceof c4f) {
                                        D = ((c4f) a).D();
                                    } else {
                                        throw new GeneralSecurityException(eub.p("Cannot get output prefix for key of class ", a.getClass().getName(), " with parameters ", String.valueOf(a.B())));
                                    }
                                    qte qteVar = new qte((sbe) tw8Var.l(w), w.d);
                                    byte[] bArr = D.a;
                                    if (bArr.length != 0 && bArr.length != 5) {
                                        hfd.j("PrefixMap only supports 0 and 5 byte prefixes");
                                        break;
                                    }
                                    if (hashMap.containsKey(D)) {
                                        arrayList = (List) hashMap.get(D);
                                    } else {
                                        arrayList = new ArrayList();
                                        hashMap.put(D, arrayList);
                                    }
                                    arrayList.add(qteVar);
                                }
                            }
                            B();
                            return cls.cast(new wte(new qte((sbe) tw8Var.l(N()), N().d), new b6f(hashMap)));
                        }
                        hfd.j("AeadConfigurationV1 can only create AEADs");
                        break;
                    default:
                        if (cls.equals(gce.class)) {
                            B();
                            s9e a2 = N().a();
                            if (a2 instanceof mye) {
                                mye myeVar = (mye) a2;
                                yxe yxeVar = myeVar.f;
                                ECPoint eCPoint = myeVar.g;
                                byte[] byteArray = eCPoint.getAffineX().toByteArray();
                                byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
                                ECParameterSpec p = hu7.p((bkf) ujf.a.r(yxeVar.a));
                                ECPoint eCPoint2 = new ECPoint(new BigInteger(1, byteArray), new BigInteger(1, byteArray2));
                                u2f.g(eCPoint2, p.getCurve());
                                ECPublicKey eCPublicKey = (ECPublicKey) ((KeyFactory) kkf.f.a.zza("EC")).generatePublic(new ECPublicKeySpec(eCPoint2, p));
                                hlf hlfVar = yxeVar.f;
                                if (hlfVar != null) {
                                    hlfVar.b();
                                }
                                ujf.a(yxeVar.b);
                                hkf hkfVar = (hkf) ujf.b.r(yxeVar.c);
                                v9e.Q(yxeVar);
                                myeVar.i.b();
                                u2f.g(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
                            } else if (a2 instanceof yye) {
                                yye yyeVar = (yye) a2;
                                kye kyeVar = yyeVar.f;
                                hlf hlfVar2 = yyeVar.g;
                                jce.I(kyeVar.a);
                                jce.G(kyeVar.b);
                                jce.H(kyeVar.c);
                                hlf hlfVar3 = yyeVar.h;
                                hlfVar2.b();
                                hlfVar3.b();
                            } else {
                                throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(a2.getClass())));
                            }
                            return cls.cast(new tw8(27));
                        } else if (cls.equals(hce.class)) {
                            HashMap hashMap2 = new HashMap();
                            int i8 = 0;
                            while (i8 < ((List) this.b).size()) {
                                wde w2 = w(i8);
                                if (w2.c.equals(oce.c)) {
                                    s9e a3 = w2.a();
                                    if (a3 instanceof cye) {
                                        cye cyeVar = (cye) a3;
                                        yxe yxeVar2 = cyeVar.f.f;
                                        obj = obj2;
                                        ECPrivateKey eCPrivateKey = (ECPrivateKey) ((KeyFactory) kkf.f.a.zza("EC")).generatePrivate(new ECPrivateKeySpec(ade.C(ade.D((BigInteger) cyeVar.g.b)), hu7.p((bkf) ujf.a.r(yxeVar2.a))));
                                        byte[] bArr2 = new byte[i4];
                                        hlf hlfVar4 = yxeVar2.f;
                                        if (hlfVar4 != null) {
                                            bArr2 = hlfVar4.b();
                                        }
                                        c1fVar = new vjf(eCPrivateKey, bArr2, ujf.a(yxeVar2.b), (hkf) ujf.b.r(yxeVar2.c), v9e.Q(yxeVar2), ((zze) cyeVar.D()).D().b());
                                        str = str2;
                                        i = i8;
                                    } else {
                                        obj = obj2;
                                        if (a3 instanceof oye) {
                                            oye oyeVar = (oye) a3;
                                            yye yyeVar2 = oyeVar.f;
                                            kye kyeVar2 = yyeVar2.f;
                                            hye hyeVar = kyeVar2.a;
                                            f1f I = jce.I(hyeVar);
                                            fje G = jce.G(kyeVar2.b);
                                            x0f H = jce.H(kyeVar2.c);
                                            hye hyeVar2 = hye.C;
                                            boolean equals = hyeVar.equals(hyeVar2);
                                            hye hyeVar3 = hye.f;
                                            str = str2;
                                            hye hyeVar4 = hye.e;
                                            i = i8;
                                            hye hyeVar5 = hye.d;
                                            if (equals) {
                                                i2 = 32;
                                            } else if (hyeVar != hyeVar5) {
                                                if (hyeVar != hyeVar4) {
                                                    if (hyeVar == hyeVar3) {
                                                        i2 = Token.BREAK;
                                                    } else {
                                                        hfd.j("Unrecognized HPKE KEM identifier");
                                                        break;
                                                    }
                                                } else {
                                                    i2 = 97;
                                                }
                                            } else {
                                                i2 = 65;
                                            }
                                            int i9 = i2;
                                            if (!hyeVar.equals(hyeVar2) && hyeVar != hyeVar5 && hyeVar != hyeVar4 && hyeVar != hyeVar3) {
                                                hfd.j("Unrecognized HPKE KEM identifier");
                                                break;
                                            } else {
                                                c1fVar = new c1f(new hvc(19, hlf.a(((hlf) oyeVar.g.b).b()), yyeVar2.g), I, G, H, i9, ((zze) oyeVar.D()).D());
                                            }
                                        } else {
                                            throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(a3.getClass())));
                                        }
                                    }
                                    hce hceVar = c1fVar;
                                    s9e a4 = w2.a();
                                    if (a4 instanceof uze) {
                                        D2 = ((zze) ((uze) a4).D()).D();
                                    } else if (a4 instanceof c4f) {
                                        D2 = ((c4f) a4).D();
                                    } else {
                                        throw new GeneralSecurityException(eub.p("Cannot get output prefix for key of class ", a4.getClass().getName(), " with parameters ", String.valueOf(a4.B())));
                                    }
                                    a2f a2fVar = new a2f(hceVar, w2.d);
                                    byte[] bArr3 = D2.a;
                                    if (bArr3.length != 0 && bArr3.length != 5) {
                                        hfd.j(str);
                                        break;
                                    } else {
                                        if (hashMap2.containsKey(D2)) {
                                            arrayList2 = (List) hashMap2.get(D2);
                                        } else {
                                            arrayList2 = new ArrayList();
                                            hashMap2.put(D2, arrayList2);
                                        }
                                        arrayList2.add(a2fVar);
                                    }
                                } else {
                                    str = str2;
                                    i = i8;
                                    obj = obj2;
                                }
                                i8 = i + 1;
                                obj2 = obj;
                                str2 = str;
                                i4 = 0;
                            }
                            B();
                            return cls.cast(new y1f(new b6f(hashMap2)));
                        } else {
                            hfd.j("HybridConfigurationV1 can only create HybridEncrypt and HybridDecrypt primitives");
                            return null;
                        }
                }
                return obj;
            } else {
                hfd.j("keyset must contain at least one ENABLED key");
                return null;
            }
        }
    }

    public Object t(Enum r2) {
        Object obj = ((Map) this.b).get(r2);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r2)));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z = task.getException() instanceof nxc;
        h1f h1fVar = (h1f) this.c;
        iye iyeVar = (iye) this.b;
        if (z) {
            return iyeVar.c(h1fVar.t());
        }
        if (task.getException() instanceof fv) {
            fv fvVar = (fv) task.getException();
            fvVar.getClass();
            if (fvVar.getStatusCode() == 29514) {
                return iyeVar.c(h1fVar.t());
            }
        }
        return task;
    }

    public String toString() {
        switch (this.a) {
            case 13:
                return xfe.a(P()).toString();
            default:
                return super.toString();
        }
    }

    public wde w(int i) {
        List list = (List) this.b;
        if (i >= 0 && i < list.size()) {
            wde wdeVar = (wde) list.get(i);
            if (H(wdeVar.b)) {
                if (!wdeVar.f) {
                    return (wde) list.get(i);
                }
                vs.k(hl5.l("Keyset-Entry at position ", " didn't parse correctly", i));
                return null;
            }
            vs.k(hl5.l("Keyset-Entry at position ", " has wrong status", i));
            return null;
        }
        cy7.k(rs8.k("Invalid index ", i, list.size(), " for keyset of size "));
        return null;
    }

    public sje x() {
        Integer num = (Integer) this.b;
        if (num != null) {
            if (((oce) this.c) != null) {
                return new sje(num.intValue(), (oce) this.c);
            }
            hfd.j("Variant is not set");
            return null;
        }
        hfd.j("Key size is not set");
        return null;
    }

    public lwe y() {
        Integer num = (Integer) this.b;
        if (num != null) {
            if (((jwe) this.c) != null) {
                return new lwe(num.intValue(), (jwe) this.c);
            }
            hfd.j("Variant is not set");
            return null;
        }
        hfd.j("Key size is not set");
        return null;
    }

    @Override // defpackage.f1f
    /* renamed from: zza */
    public byte[] mo19zza() {
        byte[] bArr;
        String str = ((fje) this.b).b;
        char c = 65535;
        switch (str.hashCode()) {
            case 984523022:
                if (str.equals("HmacSha256")) {
                    c = 0;
                    break;
                }
                break;
            case 984524074:
                if (str.equals("HmacSha384")) {
                    c = 1;
                    break;
                }
                break;
            case 984525777:
                if (str.equals("HmacSha512")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                bArr = t1f.f;
                break;
            case 1:
                bArr = t1f.g;
                break;
            case 2:
                bArr = t1f.h;
                break;
            default:
                hfd.j("Could not determine HPKE KDF ID");
                return null;
        }
        if (Arrays.equals(bArr, t1f.f)) {
            return t1f.b;
        }
        hfd.j("Could not determine HPKE KEM ID");
        return null;
    }

    public /* synthetic */ hvc(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ hvc(Object obj, int i) {
        this.a = i;
        this.c = obj;
    }

    public /* synthetic */ hvc(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public hvc(xk9 xk9Var, int i) {
        this.a = 23;
        this.c = xk9Var;
        this.b = new AtomicReferenceArray(i);
    }

    public hvc(rwa rwaVar, TaskCompletionSource taskCompletionSource) {
        this.a = 7;
        this.b = taskCompletionSource;
        Objects.requireNonNull(rwaVar);
        this.c = rwaVar;
    }

    public hvc(IBinder iBinder) {
        this.a = 24;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new tge(iBinder);
            this.b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public hvc(fje fjeVar) {
        Object u28Var;
        this.a = 20;
        this.b = fjeVar;
        try {
            u28Var = mu9.F();
        } catch (GeneralSecurityException unused) {
            u28Var = new u28(28);
        }
        this.c = u28Var;
    }

    public hvc(byte[] bArr, Provider provider) {
        this.a = 25;
        if (eub.d(1)) {
            this.b = new SecretKeySpec(bArr, "AES");
            this.c = provider;
            return;
        }
        hfd.j("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        throw null;
    }

    public hvc(Context context, k6 k6Var) {
        this.a = 3;
        context.getClass();
        k6Var.getClass();
        this.b = context;
        this.c = k6Var;
    }

    public /* synthetic */ hvc(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public hvc(Map map, List list) {
        this.a = 13;
        this.b = list;
        this.c = map;
        if (bve.a.a.get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                wde wdeVar = (wde) it.next();
                int i = wdeVar.d;
                if (!hashSet.contains(Integer.valueOf(i))) {
                    hashSet.add(Integer.valueOf(i));
                    if (wdeVar.e) {
                        z = true;
                    }
                } else {
                    throw new GeneralSecurityException(hl5.l("KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.", i));
                }
            }
            if (z) {
                return;
            }
            hfd.j("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            throw null;
        }
    }
}
