package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: exe  reason: default package */
/* loaded from: classes.dex */
public abstract class exe {
    public static final y5f a;
    public static final u5f b;
    public static final t3f c;
    public static final m3f d;
    public static final Map e;
    public static final Map f;

    static {
        hlf c2 = k7f.c("type.googleapis.com/google.crypto.tink.AesSivKey");
        a = new y5f(lwe.class, new tw8(25));
        b = new u5f(c2, new iv8(25));
        c = new t3f(uve.class, new d38(26));
        d = new m3f(c2, new u28(26));
        HashMap hashMap = new HashMap();
        jwe jweVar = jwe.d;
        eif eifVar = eif.RAW;
        hashMap.put(jweVar, eifVar);
        jwe jweVar2 = jwe.b;
        eif eifVar2 = eif.TINK;
        hashMap.put(jweVar2, eifVar2);
        jwe jweVar3 = jwe.c;
        eif eifVar3 = eif.CRUNCHY;
        hashMap.put(jweVar3, eifVar3);
        e = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(eif.class);
        enumMap.put((EnumMap) eifVar, (eif) jweVar);
        enumMap.put((EnumMap) eifVar2, (eif) jweVar2);
        enumMap.put((EnumMap) eifVar3, (eif) jweVar3);
        enumMap.put((EnumMap) eif.LEGACY, (eif) jweVar3);
        f = Collections.unmodifiableMap(enumMap);
    }

    public static jwe a(eif eifVar) {
        Map map = f;
        if (map.containsKey(eifVar)) {
            return (jwe) map.get(eifVar);
        }
        throw new GeneralSecurityException(a82.j(eifVar.zza(), "Unable to parse OutputPrefixType: "));
    }
}
