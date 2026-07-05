package defpackage;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xc1  reason: default package */
/* loaded from: classes3.dex */
public abstract class xc1 {
    public static final fuc a;

    /* JADX WARN: Type inference failed for: r0v2, types: [fuc, java.lang.Object] */
    static {
        new ArrayList();
        new ReentrantLock();
        a = new Object();
        int i = ik5.o;
        "UTF-16-".concat("LE");
        "UTF-16-".concat("BE");
    }

    public static byte[] a(String str, rqe rqeVar) {
        int length = str.length();
        str.getClass();
        rqeVar.getClass();
        b50 b50Var = new b50(rqeVar.f(length));
        rqeVar.e(b50Var, str, length);
        return b50Var.d();
    }

    public static String b(byte[] bArr, rqe rqeVar) {
        int length = bArr.length;
        bArr.getClass();
        rqeVar.getClass();
        StringBuilder sb = new StringBuilder(rqeVar.g(length));
        rqeVar.d(sb, bArr, length);
        return sb.toString();
    }
}
