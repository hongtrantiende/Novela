package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import org.mozilla.javascript.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ii5  reason: default package */
/* loaded from: classes3.dex */
public final class ii5 implements Comparable {
    public static final ii5 C;
    public static final ii5 D;
    public static final ii5 E;
    public static final ii5 F;
    public static final List G;
    public static final ii5 c;
    public static final ii5 d;
    public static final ii5 e;
    public static final ii5 f;
    public final int a;
    public final String b;

    static {
        ii5 ii5Var = new ii5(100, "Continue");
        ii5 ii5Var2 = new ii5(101, "Switching Protocols");
        c = ii5Var2;
        ii5 ii5Var3 = new ii5(102, "Processing");
        ii5 ii5Var4 = new ii5(Context.VERSION_ES6, "OK");
        ii5 ii5Var5 = new ii5(201, "Created");
        ii5 ii5Var6 = new ii5(202, "Accepted");
        ii5 ii5Var7 = new ii5(203, "Non-Authoritative Information");
        ii5 ii5Var8 = new ii5(204, "No Content");
        ii5 ii5Var9 = new ii5(205, "Reset Content");
        ii5 ii5Var10 = new ii5(206, "Partial Content");
        ii5 ii5Var11 = new ii5(207, "Multi-Status");
        ii5 ii5Var12 = new ii5(300, "Multiple Choices");
        ii5 ii5Var13 = new ii5(301, "Moved Permanently");
        d = ii5Var13;
        ii5 ii5Var14 = new ii5(302, "Found");
        e = ii5Var14;
        ii5 ii5Var15 = new ii5(303, "See Other");
        f = ii5Var15;
        ii5 ii5Var16 = new ii5(304, "Not Modified");
        ii5 ii5Var17 = new ii5(305, "Use Proxy");
        ii5 ii5Var18 = new ii5(306, "Switch Proxy");
        ii5 ii5Var19 = new ii5(307, "Temporary Redirect");
        C = ii5Var19;
        ii5 ii5Var20 = new ii5(308, "Permanent Redirect");
        D = ii5Var20;
        ii5 ii5Var21 = new ii5(400, "Bad Request");
        ii5 ii5Var22 = new ii5(401, "Unauthorized");
        E = ii5Var22;
        ii5 ii5Var23 = new ii5(402, "Payment Required");
        ii5 ii5Var24 = new ii5(403, "Forbidden");
        ii5 ii5Var25 = new ii5(404, "Not Found");
        ii5 ii5Var26 = new ii5(405, "Method Not Allowed");
        ii5 ii5Var27 = new ii5(406, "Not Acceptable");
        ii5 ii5Var28 = new ii5(407, "Proxy Authentication Required");
        ii5 ii5Var29 = new ii5(408, "Request Timeout");
        ii5 ii5Var30 = new ii5(409, "Conflict");
        ii5 ii5Var31 = new ii5(410, "Gone");
        ii5 ii5Var32 = new ii5(411, "Length Required");
        ii5 ii5Var33 = new ii5(412, "Precondition Failed");
        ii5 ii5Var34 = new ii5(413, "Payload Too Large");
        ii5 ii5Var35 = new ii5(414, "Request-URI Too Long");
        ii5 ii5Var36 = new ii5(415, "Unsupported Media Type");
        ii5 ii5Var37 = new ii5(416, "Requested Range Not Satisfiable");
        ii5 ii5Var38 = new ii5(417, "Expectation Failed");
        ii5 ii5Var39 = new ii5(422, "Unprocessable Entity");
        ii5 ii5Var40 = new ii5(423, "Locked");
        ii5 ii5Var41 = new ii5(424, "Failed Dependency");
        ii5 ii5Var42 = new ii5(425, "Too Early");
        ii5 ii5Var43 = new ii5(426, "Upgrade Required");
        ii5 ii5Var44 = new ii5(429, "Too Many Requests");
        ii5 ii5Var45 = new ii5(431, "Request Header Fields Too Large");
        ii5 ii5Var46 = new ii5(500, "Internal Server Error");
        ii5 ii5Var47 = new ii5(501, "Not Implemented");
        ii5 ii5Var48 = new ii5(502, "Bad Gateway");
        ii5 ii5Var49 = new ii5(503, "Service Unavailable");
        ii5 ii5Var50 = new ii5(504, "Gateway Timeout");
        F = ii5Var50;
        List B = tl1.B(ii5Var, ii5Var2, ii5Var3, ii5Var4, ii5Var5, ii5Var6, ii5Var7, ii5Var8, ii5Var9, ii5Var10, ii5Var11, ii5Var12, ii5Var13, ii5Var14, ii5Var15, ii5Var16, ii5Var17, ii5Var18, ii5Var19, ii5Var20, ii5Var21, ii5Var22, ii5Var23, ii5Var24, ii5Var25, ii5Var26, ii5Var27, ii5Var28, ii5Var29, ii5Var30, ii5Var31, ii5Var32, ii5Var33, ii5Var34, ii5Var35, ii5Var36, ii5Var37, ii5Var38, ii5Var39, ii5Var40, ii5Var41, ii5Var42, ii5Var43, ii5Var44, ii5Var45, ii5Var46, ii5Var47, ii5Var48, ii5Var49, ii5Var50, new ii5(505, "HTTP Version Not Supported"), new ii5(506, "Variant Also Negotiates"), new ii5(507, "Insufficient Storage"));
        G = B;
        int k = p17.k(tl1.s(B, 10));
        if (k < 16) {
            k = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(k);
        for (Object obj : B) {
            linkedHashMap.put(Integer.valueOf(((ii5) obj).a), obj);
        }
    }

    public ii5(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ii5 ii5Var = (ii5) obj;
        ii5Var.getClass();
        return this.a - ii5Var.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ii5) && ((ii5) obj).a == this.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return this.a + ' ' + this.b;
    }
}
