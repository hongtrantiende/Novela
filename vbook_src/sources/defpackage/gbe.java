package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gbe  reason: default package */
/* loaded from: classes.dex */
public abstract class gbe {
    public static final kj a = new kj("GetTokenResultFactory", new String[0]);

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, dy4] */
    public static dy4 a(String str) {
        Map hashMap;
        try {
            hashMap = mbe.c(str);
        } catch (jlf e) {
            a.e("Error parsing token claims", e, new Object[0]);
            hashMap = new HashMap();
        }
        ?? obj = new Object();
        obj.a = str;
        obj.b = hashMap;
        return obj;
    }
}
