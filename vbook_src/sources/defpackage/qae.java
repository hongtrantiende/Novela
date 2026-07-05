package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qae  reason: default package */
/* loaded from: classes.dex */
public final class qae {
    public static final qae f = new qae((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public qae(Boolean bool, int i, Boolean bool2, String str) {
        yve yveVar;
        EnumMap enumMap = new EnumMap(dwe.class);
        this.e = enumMap;
        if (bool == null) {
            yveVar = yve.UNINITIALIZED;
        } else if (bool.booleanValue()) {
            yveVar = yve.GRANTED;
        } else {
            yveVar = yve.DENIED;
        }
        enumMap.put((EnumMap) dwe.AD_USER_DATA, (dwe) yveVar);
        this.a = i;
        this.b = d();
        this.c = bool2;
        this.d = str;
    }

    public static qae b(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            EnumMap enumMap = new EnumMap(dwe.class);
            dwe[] dweVarArr = awe.DMA.a;
            int length = dweVarArr.length;
            int i = 1;
            int i2 = 0;
            while (i2 < length) {
                enumMap.put((EnumMap) dweVarArr[i2], (dwe) hwe.e(split[i].charAt(0)));
                i2++;
                i++;
            }
            return new qae(enumMap, parseInt, (Boolean) null, (String) null);
        }
        return f;
    }

    public static qae c(int i, Bundle bundle) {
        dwe[] dweVarArr;
        Boolean bool = null;
        if (bundle == null) {
            return new qae((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(dwe.class);
        for (dwe dweVar : awe.DMA.a) {
            enumMap.put((EnumMap) dweVar, (dwe) hwe.d(bundle.getString(dweVar.a)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new qae(enumMap, i, bool, bundle.getString("cps_display_str"));
    }

    public final yve a() {
        yve yveVar = (yve) this.e.get(dwe.AD_USER_DATA);
        if (yveVar == null) {
            return yve.UNINITIALIZED;
        }
        return yveVar;
    }

    public final String d() {
        dwe[] dweVarArr;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (dwe dweVar : awe.DMA.a) {
            sb.append(":");
            sb.append(hwe.h((yve) this.e.get(dweVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qae) {
            qae qaeVar = (qae) obj;
            if (this.b.equalsIgnoreCase(qaeVar.b) && Objects.equals(this.c, qaeVar.c)) {
                return Objects.equals(this.d, qaeVar.d);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        Boolean bool = this.c;
        if (bool == null) {
            i = 3;
        } else if (true != bool.booleanValue()) {
            i = 13;
        } else {
            i = 7;
        }
        String str = this.d;
        if (str == null) {
            hashCode = 17;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = this.b.hashCode();
        return (hashCode * Token.CATCH) + hashCode2 + (i * 29);
    }

    public final String toString() {
        dwe[] dweVarArr;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(hwe.a(this.a));
        for (dwe dweVar : awe.DMA.a) {
            sb.append(",");
            sb.append(dweVar.a);
            sb.append("=");
            yve yveVar = (yve) this.e.get(dweVar);
            if (yveVar == null) {
                sb.append("uninitialized");
            } else {
                int ordinal = yveVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                sb.append("granted");
                            }
                        } else {
                            sb.append("denied");
                        }
                    } else {
                        sb.append("eu_consent_policy");
                    }
                } else {
                    sb.append("uninitialized");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public qae(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(dwe.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = d();
        this.c = bool;
        this.d = str;
    }
}
