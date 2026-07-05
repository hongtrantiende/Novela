package org.mozilla.javascript.optimizer;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Arrays;
import java.util.regex.Pattern;
import jdk.dynalink.CallSiteDescriptor;
import jdk.dynalink.DynamicLinker;
import jdk.dynalink.DynamicLinkerFactory;
import jdk.dynalink.Operation;
import jdk.dynalink.StandardNamespace;
import jdk.dynalink.StandardOperation;
import jdk.dynalink.linker.GuardingDynamicLinker;
import jdk.dynalink.linker.support.CompositeTypeBasedGuardingDynamicLinker;
import jdk.dynalink.support.ChainedCallSite;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class Bootstrapper {
    private static final DynamicLinker linker;
    private static final Pattern SEPARATOR = Pattern.compile(":");
    public static final di1 BOOTSTRAP_HANDLE = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, di1] */
    static {
        DynamicLinkerFactory dynamicLinkerFactory = new DynamicLinkerFactory();
        dynamicLinkerFactory.setPrioritizedLinkers(new GuardingDynamicLinker[]{new CompositeTypeBasedGuardingDynamicLinker(Arrays.asList(new ConstAwareLinker(), new BooleanLinker(), new IntegerLinker(), new DoubleLinker(), new StringLinker(), new ConsStringLinker(), new NativeArrayLinker(), new BaseFunctionLinker())), new DefaultLinker()});
        linker = dynamicLinkerFactory.createLinker();
    }

    public static CallSite bootstrap(MethodHandles.Lookup lookup, String str, MethodType methodType) {
        return linker.link(new ChainedCallSite(new CallSiteDescriptor(lookup, parseOperation(str), methodType)));
    }

    private static String getNameSegment(String[] strArr, String str, int i) {
        if (i >= strArr.length) {
            return "";
        }
        return strArr[i].intern();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Operation parseOperation(String str) {
        char c;
        char c2;
        char c3;
        String[] split = SEPARATOR.split(str, -1);
        String nameSegment = getNameSegment(split, str, 0);
        String nameSegment2 = getNameSegment(split, str, 1);
        if ("PROP".equals(nameSegment)) {
            nameSegment2.getClass();
            switch (nameSegment2.hashCode()) {
                case -2087728720:
                    if (nameSegment2.equals("SETINDEX")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -2078273447:
                    if (nameSegment2.equals("SETSUPER")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1805537562:
                    if (nameSegment2.equals("GETELEMENT")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1526616260:
                    if (nameSegment2.equals("GETINDEX")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1517160987:
                    if (nameSegment2.equals("GETSUPER")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1359469759:
                    if (nameSegment2.equals("SETELEMENTSUPER")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1068525158:
                    if (nameSegment2.equals("GETWITHTHIS")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 70454:
                    if (nameSegment2.equals("GET")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 81986:
                    if (nameSegment2.equals("SET")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 64167549:
                    if (nameSegment2.equals("GETNOWARN")) {
                        c3 = '\t';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 131267674:
                    if (nameSegment2.equals("SETELEMENT")) {
                        c3 = '\n';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1119984378:
                    if (nameSegment2.equals("GETWITHTHISOPTIONAL")) {
                        c3 = 11;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2024745013:
                    if (nameSegment2.equals("GETELEMENTSUPER")) {
                        c3 = '\f';
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    return RhinoOperation.SETINDEX.withNamespace(StandardNamespace.PROPERTY);
                case 1:
                    return RhinoOperation.SETSUPER.withNamespace(StandardNamespace.PROPERTY).named(getNameSegment(split, str, 2));
                case 2:
                    return RhinoOperation.GETELEMENT.withNamespace(StandardNamespace.PROPERTY);
                case 3:
                    return RhinoOperation.GETINDEX.withNamespace(StandardNamespace.PROPERTY);
                case 4:
                    return RhinoOperation.GETSUPER.withNamespace(StandardNamespace.PROPERTY).named(getNameSegment(split, str, 2));
                case 5:
                    return RhinoOperation.SETELEMENTSUPER.withNamespace(StandardNamespace.PROPERTY);
                case 6:
                    return RhinoOperation.GETWITHTHIS.withNamespace(StandardNamespace.PROPERTY).named(getNameSegment(split, str, 2));
                case 7:
                    return StandardOperation.GET.withNamespace(StandardNamespace.PROPERTY).named(getNameSegment(split, str, 2));
                case '\b':
                    return StandardOperation.SET.withNamespace(StandardNamespace.PROPERTY).named(getNameSegment(split, str, 2));
                case '\t':
                    return RhinoOperation.GETNOWARN.withNamespace(StandardNamespace.PROPERTY).named(getNameSegment(split, str, 2));
                case '\n':
                    return RhinoOperation.SETELEMENT.withNamespace(StandardNamespace.PROPERTY);
                case 11:
                    return RhinoOperation.GETWITHTHISOPTIONAL.withNamespace(StandardNamespace.PROPERTY).named(getNameSegment(split, str, 2));
                case '\f':
                    return RhinoOperation.GETELEMENTSUPER.withNamespace(StandardNamespace.PROPERTY);
            }
        } else if ("NAME".equals(nameSegment)) {
            nameSegment2.getClass();
            switch (nameSegment2.hashCode()) {
                case -2093230015:
                    if (nameSegment2.equals("SETCONST")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1068525158:
                    if (nameSegment2.equals("GETWITHTHIS")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -2827893:
                    if (nameSegment2.equals("SETSTRICT")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 70454:
                    if (nameSegment2.equals("GET")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 81986:
                    if (nameSegment2.equals("SET")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2038845:
                    if (nameSegment2.equals("BIND")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1119984378:
                    if (nameSegment2.equals("GETWITHTHISOPTIONAL")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    return RhinoOperation.SETCONST.withNamespace(RhinoNamespace.NAME).named(getNameSegment(split, str, 2));
                case 1:
                    return RhinoOperation.GETWITHTHIS.withNamespace(RhinoNamespace.NAME).named(getNameSegment(split, str, 2));
                case 2:
                    return RhinoOperation.SETSTRICT.withNamespace(RhinoNamespace.NAME).named(getNameSegment(split, str, 2));
                case 3:
                    return StandardOperation.GET.withNamespace(RhinoNamespace.NAME).named(getNameSegment(split, str, 2));
                case 4:
                    return StandardOperation.SET.withNamespace(RhinoNamespace.NAME).named(getNameSegment(split, str, 2));
                case 5:
                    return RhinoOperation.BIND.withNamespace(RhinoNamespace.NAME).named(getNameSegment(split, str, 2));
                case 6:
                    return RhinoOperation.GETWITHTHISOPTIONAL.withNamespace(RhinoNamespace.NAME).named(getNameSegment(split, str, 2));
            }
        } else if ("MATH".equals(nameSegment)) {
            nameSegment2.getClass();
            switch (nameSegment2.hashCode()) {
                case -476562131:
                    if (nameSegment2.equals("TOBOOLEAN")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -427576109:
                    if (nameSegment2.equals("TOINT32")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -220540540:
                    if (nameSegment2.equals("TONUMBER")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -31172236:
                    if (nameSegment2.equals("TOUINT32")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 2220:
                    if (nameSegment2.equals("EQ")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 64641:
                    if (nameSegment2.equals("ADD")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1040066976:
                    if (nameSegment2.equals("SHALLOWEQ")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1373877347:
                    if (nameSegment2.equals("COMPAREGE")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1373877362:
                    if (nameSegment2.equals("COMPAREGT")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1373877502:
                    if (nameSegment2.equals("COMPARELE")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1373877517:
                    if (nameSegment2.equals("COMPARELT")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1753279506:
                    if (nameSegment2.equals("TONUMERIC")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return RhinoOperation.TOBOOLEAN.withNamespace(RhinoNamespace.MATH);
                case 1:
                    return RhinoOperation.TOINT32.withNamespace(RhinoNamespace.MATH);
                case 2:
                    return RhinoOperation.TONUMBER.withNamespace(RhinoNamespace.MATH);
                case 3:
                    return RhinoOperation.TOUINT32.withNamespace(RhinoNamespace.MATH);
                case 4:
                    return RhinoOperation.EQ.withNamespace(RhinoNamespace.MATH);
                case 5:
                    return RhinoOperation.ADD.withNamespace(RhinoNamespace.MATH);
                case 6:
                    return RhinoOperation.SHALLOWEQ.withNamespace(RhinoNamespace.MATH);
                case 7:
                    return RhinoOperation.COMPARE_GE.withNamespace(RhinoNamespace.MATH);
                case '\b':
                    return RhinoOperation.COMPARE_GT.withNamespace(RhinoNamespace.MATH);
                case '\t':
                    return RhinoOperation.COMPARE_LE.withNamespace(RhinoNamespace.MATH);
                case '\n':
                    return RhinoOperation.COMPARE_LT.withNamespace(RhinoNamespace.MATH);
                case 11:
                    return RhinoOperation.TONUMERIC.withNamespace(RhinoNamespace.MATH);
            }
        }
        throw new NoSuchMethodException(str);
    }
}
