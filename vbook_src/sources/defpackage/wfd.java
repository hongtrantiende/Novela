package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wfd  reason: default package */
/* loaded from: classes.dex */
public final class wfd {
    public final int a;
    public final Object b;
    public final Throwable c;
    public final Map d;
    public final boolean e;

    public wfd(int i, Object obj, Throwable th, LinkedHashMap linkedHashMap, int i2) {
        obj = (i2 & 2) != 0 ? null : obj;
        th = (i2 & 4) != 0 ? null : th;
        Map map = (i2 & 8) != 0 ? ls3.a : linkedHashMap;
        this.a = i;
        this.b = obj;
        this.c = th;
        this.d = map;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wfd) {
                wfd wfdVar = (wfd) obj;
                if (this.a != wfdVar.a || !c16.i(this.b, wfdVar.b) || !c16.i(this.c, wfdVar.c) || !this.d.equals(wfdVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.a) * 31;
        int i = 0;
        Object obj = this.b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Throwable th = this.c;
        if (th != null) {
            i = th.hashCode();
        }
        return this.d.hashCode() + ((i2 + i) * 31);
    }

    public final String toString() {
        return "WebClientResult(statusCode=" + this.a + ", body=" + this.b + ", error=" + this.c + ", headers=" + this.d + ")";
    }
}
