package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d41  reason: default package */
/* loaded from: classes.dex */
public final class d41 {
    public static final String c;
    public static final Set d;
    public static final d41 e;
    public static final d41 f;
    public final String a;
    public final String b;

    static {
        String z = vqe.z("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = z;
        String z2 = vqe.z("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String z3 = vqe.z("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new bt3("proto"), new bt3("json"))));
        e = new d41(z, null);
        f = new d41(z2, z3);
    }

    public d41(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static d41 a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        String str2 = null;
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str3 = split[0];
                if (!str3.isEmpty()) {
                    String str4 = split[1];
                    if (!str4.isEmpty()) {
                        str2 = str4;
                    }
                    return new d41(str3, str2);
                }
                vs.m("Missing endpoint in CCTDestination extras");
                return null;
            }
            vs.m("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        vs.m("Version marker missing from extras");
        return null;
    }
}
