package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s66  reason: default package */
/* loaded from: classes3.dex */
public abstract class s66 {
    public static final mfb a = new mfb(new v16(10));

    public static final bl5 a(Map map) {
        List list;
        String str = (String) map.get("iss");
        String str2 = (String) map.get("sub");
        Object obj = map.get("aud");
        List list2 = null;
        if (obj != null) {
            if (obj instanceof List) {
                list = (List) obj;
            } else {
                list = tl1.A((String) obj);
            }
        } else {
            list = null;
        }
        Long l = (Long) map.get("exp");
        Long l2 = (Long) map.get("iat");
        Long l3 = (Long) map.get("auth_time");
        String str3 = (String) map.get("nonce");
        String str4 = (String) map.get("acr");
        Object obj2 = map.get("amr");
        if (obj2 != null) {
            if (obj2 instanceof List) {
                list2 = (List) obj2;
            } else {
                list2 = tl1.A((String) obj2);
            }
        }
        return new bl5(str, str2, list, l, l2, l3, str3, str4, list2, (String) map.get("azp"), (String) map.get("alg"), (String) map.get("kid"), (String) map.get("at_hash"), map);
    }
}
