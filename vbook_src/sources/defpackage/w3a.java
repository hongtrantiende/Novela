package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w3a  reason: default package */
/* loaded from: classes3.dex */
public final class w3a extends f3 {
    public final gi1 a;
    public final ye6 b;
    public final Map c;
    public final LinkedHashMap d;

    public w3a(String str, gi1 gi1Var, gi1[] gi1VarArr, s76[] s76VarArr) {
        this.a = gi1Var;
        this.b = ipe.x(sk6.b, new mm7(22, str, this));
        if (gi1VarArr.length == s76VarArr.length) {
            int min = Math.min(gi1VarArr.length, s76VarArr.length);
            ArrayList arrayList = new ArrayList(min);
            for (int i = 0; i < min; i++) {
                arrayList.add(new yk8(gi1VarArr[i], s76VarArr[i]));
            }
            Map x = o17.x(arrayList);
            this.c = x;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : x.entrySet()) {
                String a = ((s76) entry.getValue()).e().a();
                Object obj = linkedHashMap.get(a);
                if (obj == null) {
                    linkedHashMap.containsKey(a);
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (entry2 == null) {
                    linkedHashMap.put(a, entry);
                } else {
                    StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                    sb.append(this.a);
                    sb.append("' have the same serial name '");
                    sb.append(a);
                    sb.append("': '");
                    sb.append(entry2.getKey());
                    Object key = entry.getKey();
                    sb.append("', '");
                    sb.append(key);
                    sb.append('\'');
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(p17.k(linkedHashMap.size()));
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry3.getKey(), (s76) ((Map.Entry) entry3.getValue()).getValue());
            }
            this.d = linkedHashMap2;
            return;
        }
        String g = gi1Var.g();
        throw new IllegalArgumentException("All subclasses of sealed class " + g + " should be marked @Serializable");
    }

    @Override // defpackage.s76
    public final o9a e() {
        return (o9a) this.b.getValue();
    }

    @Override // defpackage.f3
    public final s76 f(fx1 fx1Var, String str) {
        s76 s76Var = (s76) this.d.get(str);
        if (s76Var != null) {
            return s76Var;
        }
        return super.f(fx1Var, str);
    }

    @Override // defpackage.f3
    public final s76 g(jbe jbeVar, Object obj) {
        s76 g;
        obj.getClass();
        s76 s76Var = (s76) this.c.get(cm9.a(obj.getClass()));
        if (s76Var != null) {
            g = s76Var;
        } else {
            g = super.g(jbeVar, obj);
        }
        if (g != null) {
            return g;
        }
        return null;
    }

    @Override // defpackage.f3
    public final gi1 h() {
        return this.a;
    }
}
