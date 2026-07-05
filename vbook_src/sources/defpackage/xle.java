package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xle  reason: default package */
/* loaded from: classes.dex */
public abstract class xle {
    public static final y5f a;
    public static final u5f b;
    public static final t3f c;
    public static final m3f d;

    static {
        hlf c2 = k7f.c("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        a = new y5f(ole.class, new d38(21));
        b = new u5f(c2, new pq8(21));
        c = new t3f(rle.class, new fn8(21));
        d = new m3f(c2, new u28(22));
    }

    public static ole a(aif aifVar, eif eifVar) {
        lie lieVar;
        fje fjeVar = fje.C;
        lie lieVar2 = lie.G;
        lie lieVar3 = lie.F;
        lie lieVar4 = lie.E;
        lie lieVar5 = lie.C;
        lie lieVar6 = lie.D;
        lie lieVar7 = lie.f;
        mgf t = ogf.t();
        t.f(aifVar.t().B());
        t.g(aifVar.t().A());
        t.e(eif.RAW);
        bfe s = y9e.s(((ogf) t.b()).c());
        if (s instanceof gje) {
            lieVar = lieVar7;
        } else if (s instanceof dke) {
            lieVar = lieVar6;
        } else if (s instanceof koe) {
            lieVar = lieVar5;
        } else if (s instanceof bie) {
            lieVar = lieVar4;
        } else if (s instanceof oie) {
            lieVar = lieVar3;
        } else if (s instanceof sje) {
            lieVar = lieVar2;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(String.valueOf(s)));
        }
        int i = eme.a[eifVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new GeneralSecurityException(a82.j(eifVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        } else {
            fjeVar = fje.f;
        }
        String z = aifVar.z();
        jhe jheVar = (jhe) s;
        if (z != null) {
            if (!jheVar.a()) {
                if ((lieVar == lieVar7 && (jheVar instanceof gje)) || ((lieVar == lieVar6 && (jheVar instanceof dke)) || ((lieVar == lieVar5 && (jheVar instanceof koe)) || ((lieVar == lieVar4 && (jheVar instanceof bie)) || ((lieVar == lieVar3 && (jheVar instanceof oie)) || (lieVar == lieVar2 && (jheVar instanceof sje))))))) {
                    return new ole(fjeVar, z, lieVar, jheVar);
                }
                throw new GeneralSecurityException(hl5.o("Cannot use parsing strategy ", lieVar.b, " when new keys are picked according to ", String.valueOf(jheVar), "."));
            }
            hfd.j("dekParametersForNewKeys must not have ID Requirements");
            return null;
        }
        hfd.j("kekUri must be set");
        return null;
    }

    public static aif b(ole oleVar) {
        try {
            ogf u = ogf.u(y9e.u(oleVar.d), g7e.a);
            zhf x = aif.x();
            String str = oleVar.b;
            x.c();
            aif.v((aif) x.b, str);
            x.c();
            aif.w((aif) x.b, u);
            return (aif) x.b();
        } catch (w7e e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }
}
