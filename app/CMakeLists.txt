# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.6.0)

# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.

set(SRC_DIR src/main/jni)
set(SRC_NCNN_DIR src/main/ncnn)

#configure_file(platform.h.in ${SRC_NCNN_DIR}/platform.h)

include_directories(${SRC_NCNN_DIR})
include_directories(${CMAKE_CURRENT_SOURCE_DIR/src/main/jni})
include_directories(${CMAKE_CURRENT_SOURCE_DIR/src/main/ncnn})
include_directories(${CMAKE_CURRENT_SOURCE_DIR/src/main/ncnn/layer})
include_directories(${CMAKE_CURRENT_SOURCE_DIR/src/main/ncnn/layer/arm})
include_directories(${CMAKE_CURRENT_SOURCE_DIR/src/main/ncnn/layer/x86})



#include_directories(${SRC_NCNN_DIR}/layer)
#include_directories(${SRC_NCNN_DIR}/layer/arm)
#include_directories(${SRC_NCNN_DIR}/layer/x86)


#set(SRC_DIR src/main/jni)
#set(SRC_NCNN_DIR src/main/ncnn)

#set(NCNN_DIR ../../ncnn/install/include/)
#set(NCNN_STATIC ../../ncnn/install/lib/)
#set(NCNN_DIR src/main/cpp/ncnn)
#set(NCNN_LAYER_DIR src/main/cpp/ncnn/layer)

add_library( # Sets the name of the library.
             #squeezencnn
             MobileNetssd

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
        #     ${SRC_DIR}/squeezencnn_jni.cpp
         #    ${SRC_DIR}/squeezenet_v1.1.id.h

             ${SRC_DIR}/MobileNetssd.cpp
             ${SRC_DIR}/MobileNetSSD_deploy.id.h
             #${SRC_NCNN_DIR}/net.h
             ${SRC_NCNN_DIR}/platform.h.in
             ${SRC_NCNN_DIR}/Makefile
             ${SRC_NCNN_DIR}/blob.h
             ${SRC_NCNN_DIR}/blob.cpp
             ${SRC_NCNN_DIR}/layer.h
             ${SRC_NCNN_DIR}/layer.cpp
             ${SRC_NCNN_DIR}/layer_registry.h
             ${SRC_NCNN_DIR}/benchmark.cpp
             ${SRC_NCNN_DIR}/benchmark.h
             ${SRC_NCNN_DIR}/net.cpp
             ${SRC_NCNN_DIR}/net.h
             ${SRC_NCNN_DIR}/paramdict.h
             ${SRC_NCNN_DIR}/opencv.h
             ${SRC_NCNN_DIR}/allocator.h
             ${SRC_NCNN_DIR}/allocator.cpp
             ${SRC_NCNN_DIR}/cpu.h
             ${SRC_NCNN_DIR}/mat.cpp
             ${SRC_NCNN_DIR}/layer_type_enum.h
             ${SRC_NCNN_DIR}/modelbin.cpp
             ${SRC_NCNN_DIR}/layer_type.h
             ${SRC_NCNN_DIR}/mat_pixel.cpp
             ${SRC_NCNN_DIR}/mat_pixel_resize.cpp
             ${SRC_NCNN_DIR}/benchmark.h
             ${SRC_NCNN_DIR}/cpu.cpp
             ${SRC_NCNN_DIR}/cpu.h
             ${SRC_NCNN_DIR}/gpu.cpp
             ${SRC_NCNN_DIR}/gpu.h
             ${SRC_NCNN_DIR}/layer_declaration.h
            # ${SRC_NCNN_DIR}/layer_declaration.cpp
             ${SRC_NCNN_DIR}/platform.h
             ${SRC_NCNN_DIR}/opencv.cpp
             ${SRC_NCNN_DIR}/opencv.h
             ${SRC_NCNN_DIR}/paramdict.cpp
             ${SRC_NCNN_DIR}/pipeline.cpp
             ${SRC_NCNN_DIR}/pipeline.h
             ${SRC_NCNN_DIR}/command.cpp
             ${SRC_NCNN_DIR}/command.h
             ${SRC_NCNN_DIR}/layer/flatten.cpp
             ${SRC_NCNN_DIR}/layer/softmax.h
             ${SRC_NCNN_DIR}/layer/squeeze.cpp
             ${SRC_NCNN_DIR}/layer/dropout.cpp
             ${SRC_NCNN_DIR}/layer/quantize.h
             ${SRC_NCNN_DIR}/layer/dequantize.h
             ${SRC_NCNN_DIR}/layer/permute.h
             ${SRC_NCNN_DIR}/layer/batchnorm.cpp
             ${SRC_NCNN_DIR}/layer/argmax.cpp
             ${SRC_NCNN_DIR}/layer/shufflechannel.cpp
             ${SRC_NCNN_DIR}/layer/scale.h
             ${SRC_NCNN_DIR}/layer/power.h
             ${SRC_NCNN_DIR}/layer/flatten.h
             ${SRC_NCNN_DIR}/layer/embed.h
             ${SRC_NCNN_DIR}/layer/roialign.h
             ${SRC_NCNN_DIR}/layer/dequantize.cpp
             ${SRC_NCNN_DIR}/layer/input.h
             ${SRC_NCNN_DIR}/layer/log.cpp
             ${SRC_NCNN_DIR}/layer/detectionoutput.cpp
             ${SRC_NCNN_DIR}/layer/memorydata.cpp
             ${SRC_NCNN_DIR}/layer/eltwise.h
             ${SRC_NCNN_DIR}/layer/input.cpp
             ${SRC_NCNN_DIR}/layer/reshape.cpp
             ${SRC_NCNN_DIR}/layer/rnn.h
             ${SRC_NCNN_DIR}/layer/sigmoid.cpp
             ${SRC_NCNN_DIR}/layer/shufflechannel.h
             ${SRC_NCNN_DIR}/layer/deconvolution.cpp
             ${SRC_NCNN_DIR}/layer/interp.cpp
             ${SRC_NCNN_DIR}/layer/deconvolutiondepthwise.cpp
             ${SRC_NCNN_DIR}/layer/tile.h
             ${SRC_NCNN_DIR}/layer/psroipooling.h
             ${SRC_NCNN_DIR}/layer/batchnorm.h
             ${SRC_NCNN_DIR}/layer/tanh.cpp
             ${SRC_NCNN_DIR}/layer/expanddims.cpp
             ${SRC_NCNN_DIR}/layer/relu.h
             ${SRC_NCNN_DIR}/layer/split.cpp
             ${SRC_NCNN_DIR}/layer/reorg.cpp
             ${SRC_NCNN_DIR}/layer/roipooling.cpp
             ${SRC_NCNN_DIR}/layer/convolution.h
             ${SRC_NCNN_DIR}/layer/reduction.cpp
             ${SRC_NCNN_DIR}/layer/permute.cpp
             ${SRC_NCNN_DIR}/layer/proposal.h
             ${SRC_NCNN_DIR}/layer/bnll.cpp
             ${SRC_NCNN_DIR}/layer/elu.cpp
             ${SRC_NCNN_DIR}/layer/exp.cpp
             ${SRC_NCNN_DIR}/layer/instancenorm.h
             ${SRC_NCNN_DIR}/layer/relu.cpp
             ${SRC_NCNN_DIR}/layer/embed.cpp
             ${SRC_NCNN_DIR}/layer/bias.h
             ${SRC_NCNN_DIR}/layer/prelu.h
             ${SRC_NCNN_DIR}/layer/absval.h
             ${SRC_NCNN_DIR}/layer/slice.cpp
             ${SRC_NCNN_DIR}/layer/slice.h
             ${SRC_NCNN_DIR}/layer/lrn.cpp
             ${SRC_NCNN_DIR}/layer/normalize.h
             ${SRC_NCNN_DIR}/layer/instancenorm.cpp
             ${SRC_NCNN_DIR}/layer/spp.h
             ${SRC_NCNN_DIR}/layer/proposal.cpp
             ${SRC_NCNN_DIR}/layer/eltwise.cpp
             ${SRC_NCNN_DIR}/layer/prelu.cpp
             ${SRC_NCNN_DIR}/layer/pooling.cpp
             ${SRC_NCNN_DIR}/layer/priorbox.h
             ${SRC_NCNN_DIR}/layer/lstm.h
             ${SRC_NCNN_DIR}/layer/spp.cpp
             ${SRC_NCNN_DIR}/layer/lstm.cpp
             ${SRC_NCNN_DIR}/layer/threshold.h
             ${SRC_NCNN_DIR}/layer/normalize.cpp
             ${SRC_NCNN_DIR}/layer/concat.cpp
             ${SRC_NCNN_DIR}/layer/concat.h
             ${SRC_NCNN_DIR}/layer/tanh.h
             ${SRC_NCNN_DIR}/layer/convolutiondepthwise.cpp
             ${SRC_NCNN_DIR}/layer/rnn.cpp
             ${SRC_NCNN_DIR}/layer/convolutiondepthwise.h
             ${SRC_NCNN_DIR}/layer/crop.cpp
             ${SRC_NCNN_DIR}/layer/psroipooling.cpp
             ${SRC_NCNN_DIR}/layer/power.cpp
             ${SRC_NCNN_DIR}/layer/mvn.cpp
             ${SRC_NCNN_DIR}/layer/dropout.h
             ${SRC_NCNN_DIR}/layer/elu.h
             ${SRC_NCNN_DIR}/layer/priorbox.cpp
             ${SRC_NCNN_DIR}/layer/log.h
             ${SRC_NCNN_DIR}/layer/clip.h
             ${SRC_NCNN_DIR}/layer/reshape.h
             ${SRC_NCNN_DIR}/layer/crop.h
             ${SRC_NCNN_DIR}/layer/memorydata.h
             ${SRC_NCNN_DIR}/layer/innerproduct.cpp
             ${SRC_NCNN_DIR}/layer/argmax.h
             ${SRC_NCNN_DIR}/layer/yolov3detectionoutput.h
             ${SRC_NCNN_DIR}/layer/sigmoid.h
             ${SRC_NCNN_DIR}/layer/softmax.cpp
             ${SRC_NCNN_DIR}/layer/deconvolutiondepthwise.h
             ${SRC_NCNN_DIR}/layer/bnll.h
             ${SRC_NCNN_DIR}/layer/clip.cpp
             ${SRC_NCNN_DIR}/layer/padding.cpp
             ${SRC_NCNN_DIR}/layer/reorg.h
             ${SRC_NCNN_DIR}/layer/roipooling.h
             ${SRC_NCNN_DIR}/layer/threshold.cpp
             ${SRC_NCNN_DIR}/layer/quantize.cpp
             ${SRC_NCNN_DIR}/layer/yolov3detectionoutput.cpp
             ${SRC_NCNN_DIR}/layer/tile.cpp
             ${SRC_NCNN_DIR}/layer/detectionoutput.h
             ${SRC_NCNN_DIR}/layer/exp.h
             ${SRC_NCNN_DIR}/layer/pooling.h
             ${SRC_NCNN_DIR}/layer/cast.h
             ${SRC_NCNN_DIR}/layer/cast.cpp
             ${SRC_NCNN_DIR}/layer/packing.h
             ${SRC_NCNN_DIR}/layer/packing.cpp

             ${SRC_NCNN_DIR}/layer/squeeze.h
             ${SRC_NCNN_DIR}/layer/yolodetectionoutput.h
             ${SRC_NCNN_DIR}/layer/bias.cpp
             ${SRC_NCNN_DIR}/layer/scale.cpp
             ${SRC_NCNN_DIR}/layer/binaryop.cpp
             ${SRC_NCNN_DIR}/layer/unaryop.h
             ${SRC_NCNN_DIR}/layer/interp.h
             ${SRC_NCNN_DIR}/layer/unaryop.cpp
             ${SRC_NCNN_DIR}/layer/innerproduct.h
             ${SRC_NCNN_DIR}/layer/mvn.h
             ${SRC_NCNN_DIR}/layer/expanddims.h
             ${SRC_NCNN_DIR}/layer/reduction.h
             ${SRC_NCNN_DIR}/layer/absval.cpp
             ${SRC_NCNN_DIR}/layer/convolution.cpp
             ${SRC_NCNN_DIR}/layer/roialign.cpp
             ${SRC_NCNN_DIR}/layer/split.h
             ${SRC_NCNN_DIR}/layer/binaryop.h
             ${SRC_NCNN_DIR}/layer/deconvolution.h
             ${SRC_NCNN_DIR}/layer/padding.h
             ${SRC_NCNN_DIR}/layer/yolodetectionoutput.cpp
             ${SRC_NCNN_DIR}/layer/lrn.h
             




             ${SRC_NCNN_DIR}/layer/x86/convolution_1x1.h
             ${SRC_NCNN_DIR}/layer/x86/convolutiondepthwise_x86.h
             ${SRC_NCNN_DIR}/layer/x86/convolution_1x1_int8.h
             ${SRC_NCNN_DIR}/layer/x86/convolution_5x5.h
             ${SRC_NCNN_DIR}/layer/x86/convolutiondepthwise_3x3.h
             ${SRC_NCNN_DIR}/layer/x86/convolutiondepthwise_x86.cpp
             ${SRC_NCNN_DIR}/layer/x86/convolutiondepthwise_3x3_int8.h
             ${SRC_NCNN_DIR}/layer/x86/convolution_x86.cpp
             ${SRC_NCNN_DIR}/layer/x86/convolution_3x3.h
             ${SRC_NCNN_DIR}/layer/x86/sse_mathfun.h
             ${SRC_NCNN_DIR}/layer/x86/convolution_3x3_int8.h
             ${SRC_NCNN_DIR}/layer/x86/convolution_x86.h
             ${SRC_NCNN_DIR}/layer/x86/avx_mathfun.h
             ${SRC_NCNN_DIR}/layer/x86/convolution_5x5_int8.h
             ${SRC_NCNN_DIR}/layer/x86/convolution_7x7_int8.h
             ${SRC_NCNN_DIR}/layer/x86/convolution_sgemm_int8.h

             ${SRC_NCNN_DIR}/layer/arm/relu_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/deconvolution_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/convolution_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/dequantize_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/lrn_arm.h
             ${SRC_NCNN_DIR}/layer/arm/convolution_1x1.h
             ${SRC_NCNN_DIR}/layer/arm/convolutiondepthwise_arm.h
             ${SRC_NCNN_DIR}/layer/arm/batchnorm_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/convolutiondepthwise_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/innerproduct_arm.h
             ${SRC_NCNN_DIR}/layer/arm/dequantize_arm.h
             ${SRC_NCNN_DIR}/layer/arm/bias_arm.h
             ${SRC_NCNN_DIR}/layer/arm/convolution_1x1_int8.h
             ${SRC_NCNN_DIR}/layer/arm/convolution_5x5.h
             ${SRC_NCNN_DIR}/layer/arm/softmax_arm.h
             ${SRC_NCNN_DIR}/layer/arm/softmax_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/convolution_2x2.h
             ${SRC_NCNN_DIR}/layer/arm/convolutiondepthwise_3x3.h
             ${SRC_NCNN_DIR}/layer/arm/quantize_arm.h
             ${SRC_NCNN_DIR}/layer/arm/quantize_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/convolutiondepthwise_3x3_int8.h
             ${SRC_NCNN_DIR}/layer/arm/pooling_2x2.h
             ${SRC_NCNN_DIR}/layer/arm/eltwise_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/lrn_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/bias_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/sigmoid_arm.h
             ${SRC_NCNN_DIR}/layer/arm/innerproduct_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/convolution_3x3.h
             ${SRC_NCNN_DIR}/layer/arm/deconvolution_4x4.h
             ${SRC_NCNN_DIR}/layer/arm/relu_arm.h
             ${SRC_NCNN_DIR}/layer/arm/eltwise_arm.h
             ${SRC_NCNN_DIR}/layer/arm/batchnorm_arm.h
             ${SRC_NCNN_DIR}/layer/arm/convolution_7x7.h
             ${SRC_NCNN_DIR}/layer/arm/neon_mathfun.h
             ${SRC_NCNN_DIR}/layer/arm/prelu_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/pooling_3x3.h
             ${SRC_NCNN_DIR}/layer/arm/convolution_3x3_int8.h
             ${SRC_NCNN_DIR}/layer/arm/deconvolution_arm.h
             ${SRC_NCNN_DIR}/layer/arm/scale_arm.h
             ${SRC_NCNN_DIR}/layer/arm/clip_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/deconvolutiondepthwise_arm.h
             ${SRC_NCNN_DIR}/layer/arm/prelu_arm.h
             ${SRC_NCNN_DIR}/layer/arm/convolution_arm.h
             ${SRC_NCNN_DIR}/layer/arm/scale_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/absval_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/sigmoid_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/pooling_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/deconvolutiondepthwise_arm.cpp
             ${SRC_NCNN_DIR}/layer/arm/clip_arm.h
             ${SRC_NCNN_DIR}/layer/arm/deconvolution_3x3.h
             ${SRC_NCNN_DIR}/layer/arm/absval_arm.h
             ${SRC_NCNN_DIR}/layer/arm/convolution_4x4.h
             ${SRC_NCNN_DIR}/layer/arm/pooling_arm.h
             ${SRC_NCNN_DIR}/layer/arm/convolutiondepthwise_5x5.h

             ${SRC_NCNN_DIR}/layer/arm/convolution_5x5_int8.h
             ${SRC_NCNN_DIR}/layer/arm/convolution_7x7_int8.h
             ${SRC_NCNN_DIR}/layer/arm/convolution_sgemm_int8.h
             )


macro(ncnn_add_layer class)
    string(TOLOWER ${class} name)

    # WITH_LAYER_xxx option
    if(${ARGC} EQUAL 2)
        option(WITH_LAYER_${name} "build with layer ${name}" ${ARGV1})
    else()
        option(WITH_LAYER_${name} "build with layer ${name}" ON)
    endif()

    if(NCNN_CMAKE_VERBOSE)
        message(STATUS "WITH_LAYER_${name} = ${WITH_LAYER_${name}}")
    endif()

    if(WITH_LAYER_${name})
        list(APPEND ncnn_SRCS "${CMAKE_CURRENT_SOURCE_DIR}/layer/${name}.cpp")

        # look for arch specific implementation and append source
        # optimized implementation for armv7, aarch64 or x86
        if((IOS AND CMAKE_OSX_ARCHITECTURES MATCHES "arm")
                OR (CMAKE_SYSTEM_PROCESSOR MATCHES "^(arm|aarch64)"))
            set(arch arm)
        else()
            set(arch x86)
        endif()
        set(LAYER_SRC ${CMAKE_CURRENT_SOURCE_DIR}/layer/${arch}/${name}_${arch}.cpp)
        if(EXISTS ${LAYER_SRC})
            set(WITH_LAYER_${name}_${arch} 1)
            list(APPEND ncnn_SRCS ${LAYER_SRC})
            if(NCNN_CMAKE_VERBOSE)
                message(STATUS "Adding layer: ${LAYER_SRC}")
            endif()
        endif()
    endif()

    # generate layer_declaration and layer_registry file
    if(WITH_LAYER_${name})
        if(WITH_LAYER_${name}_${arch})
            string(APPEND layer_declaration
                    "extern Layer* ${class}_${arch}_layer_creator();\n")
            string(APPEND layer_registry
                    "#if NCNN_STRING\n{\"${class}\",${class}_${arch}_layer_creator},\n#else\n{${class}_${arch}_layer_creator},\n#endif\n")
        else()
            string(APPEND layer_declaration
                    "extern Layer* ${class}_layer_creator();\n")
            string(APPEND layer_registry
                    "#if NCNN_STRING\n{\"${class}\",${class}_layer_creator},\n#else\n{${class}_layer_creator},\n#endif\n")
        endif()
    else()
        string(APPEND layer_registry "#if NCNN_STRING\n{\"${class}\",0},\n#else\n{0},\n#endif\n")
    endif()

    if(WITH_LAYER_${name} AND NCNN_VULKAN)
        file(GLOB_RECURSE SHADER_SRCS "layer/shader/${name}.comp")
        file(GLOB_RECURSE SHADER_SUBSRCS "layer/shader/${name}_*.comp")
        list(APPEND SHADER_SRCS ${SHADER_SUBSRCS})
        foreach(SHADER_SRC ${SHADER_SRCS})
            get_filename_component(SHADER_SRC_NAME_WE ${SHADER_SRC} NAME_WE)

            set(SHADER_SPV_HEX_FILE ${CMAKE_CURRENT_BINARY_DIR}/${SHADER_SRC_NAME_WE}.spv.hex.h)
            add_custom_command(
                    OUTPUT ${SHADER_SPV_HEX_FILE}
                    COMMAND ${GLSLANGVALIDATOR_EXECUTABLE}
                    ARGS -Dsfp=float -Dsfpvec2=vec2 -Dsfpvec4=vec4 -Dsfpmat4=mat4 -Dafp=float -Dafpvec2=vec2 -Dafpvec4=vec4 -Dafpmat4=mat4 -V -s -e ${SHADER_SRC_NAME_WE} --source-entrypoint main -x -o ${SHADER_SPV_HEX_FILE} ${SHADER_SRC}
                    DEPENDS ${SHADER_SRC}
                    COMMENT "Building SPIR-V module ${SHADER_SRC_NAME_WE}.spv"
                    VERBATIM
            )
            set_source_files_properties(${SHADER_SPV_HEX_FILE} PROPERTIES GENERATED TRUE)

            string(APPEND layer_shader_spv_data "static const uint32_t ${SHADER_SRC_NAME_WE}_spv_data[] = {\n#include \"${SHADER_SRC_NAME_WE}.spv.hex.h\"\n};\n")
            string(APPEND layer_shader_registry "{\"${SHADER_SRC_NAME_WE}\",${SHADER_SRC_NAME_WE}_spv_data,sizeof(${SHADER_SRC_NAME_WE}_spv_data)},\n")

            list(APPEND SHADER_SPV_HEX_FILES ${SHADER_SPV_HEX_FILE})

            # fp16 storage
            set(SHADER_fp16s_SRC_NAME_WE "${SHADER_SRC_NAME_WE}_fp16s")

            set(SHADER_fp16s_SPV_HEX_FILE ${CMAKE_CURRENT_BINARY_DIR}/${SHADER_fp16s_SRC_NAME_WE}.spv.hex.h)
            add_custom_command(
                    OUTPUT ${SHADER_fp16s_SPV_HEX_FILE}
                    COMMAND ${GLSLANGVALIDATOR_EXECUTABLE}
                    ARGS -Dsfp=float16_t -Dsfpvec2=f16vec2 -Dsfpvec4=f16vec4 -Dafp=float -Dafpvec2=vec2 -Dafpvec4=vec4 -Dafpmat4=mat4 -DNCNN_fp16_storage=1 -V -s -e ${SHADER_fp16s_SRC_NAME_WE} --source-entrypoint main -x -o ${SHADER_fp16s_SPV_HEX_FILE} ${SHADER_SRC}
                    DEPENDS ${SHADER_SRC}
                    COMMENT "Building SPIR-V module ${SHADER_fp16s_SRC_NAME_WE}.spv"
                    VERBATIM
            )
            set_source_files_properties(${SHADER_fp16s_SPV_HEX_FILE} PROPERTIES GENERATED TRUE)

            string(APPEND layer_shader_spv_data "static const uint32_t ${SHADER_fp16s_SRC_NAME_WE}_spv_data[] = {\n#include \"${SHADER_fp16s_SRC_NAME_WE}.spv.hex.h\"\n};\n")
            string(APPEND layer_shader_registry "{\"${SHADER_fp16s_SRC_NAME_WE}\",${SHADER_fp16s_SRC_NAME_WE}_spv_data,sizeof(${SHADER_fp16s_SRC_NAME_WE}_spv_data)},\n")

            list(APPEND SHADER_SPV_HEX_FILES ${SHADER_fp16s_SPV_HEX_FILE})

            # fp16 storage + fp16 arithmetic
            set(SHADER_fp16a_SRC_NAME_WE "${SHADER_SRC_NAME_WE}_fp16a")

            set(SHADER_fp16a_SPV_HEX_FILE ${CMAKE_CURRENT_BINARY_DIR}/${SHADER_fp16a_SRC_NAME_WE}.spv.hex.h)
            add_custom_command(
                    OUTPUT ${SHADER_fp16a_SPV_HEX_FILE}
                    COMMAND ${GLSLANGVALIDATOR_EXECUTABLE}
                    ARGS -Dsfp=float16_t -Dsfpvec2=f16vec2 -Dsfpvec4=f16vec4 -Dsfpmat4=f16mat4 -Dafp=float16_t -Dafpvec2=f16vec2 -Dafpvec4=f16vec4 -Dafpmat4=f16mat4 -DNCNN_fp16_storage=1 -DNCNN_fp16_arithmetic=1 -V -s -e ${SHADER_fp16a_SRC_NAME_WE} --source-entrypoint main -x -o ${SHADER_fp16a_SPV_HEX_FILE} ${SHADER_SRC}
                    DEPENDS ${SHADER_SRC}
                    COMMENT "Building SPIR-V module ${SHADER_fp16a_SRC_NAME_WE}.spv"
                    VERBATIM
            )
            set_source_files_properties(${SHADER_fp16a_SPV_HEX_FILE} PROPERTIES GENERATED TRUE)

            string(APPEND layer_shader_spv_data "static const uint32_t ${SHADER_fp16a_SRC_NAME_WE}_spv_data[] = {\n#include \"${SHADER_fp16a_SRC_NAME_WE}.spv.hex.h\"\n};\n")
            string(APPEND layer_shader_registry "{\"${SHADER_fp16a_SRC_NAME_WE}\",${SHADER_fp16a_SRC_NAME_WE}_spv_data,sizeof(${SHADER_fp16a_SRC_NAME_WE}_spv_data)},\n")

            list(APPEND SHADER_SPV_HEX_FILES ${SHADER_fp16a_SPV_HEX_FILE})
        endforeach()
    endif()

    # generate layer_type_enum file
    string(APPEND layer_type_enum "${class} = ${__LAYER_TYPE_ENUM_INDEX},\n")
#    math(EXPR __LAYER_TYPE_ENUM_INDEX "${__LAYER_TYPE_ENUM_INDEX}+1")
endmacro()

# look for vulkan compute shader and compile
#set(SHADER_SPV_HEX_FILES)

#set(__LAYER_TYPE_ENUM_INDEX 0)

# layer implementation
ncnn_add_layer(AbsVal)
ncnn_add_layer(ArgMax OFF)
ncnn_add_layer(BatchNorm)
ncnn_add_layer(Bias)
ncnn_add_layer(BNLL)
ncnn_add_layer(Concat)
ncnn_add_layer(Convolution)
ncnn_add_layer(Crop)
ncnn_add_layer(Deconvolution)
ncnn_add_layer(Dropout)
ncnn_add_layer(Eltwise)
ncnn_add_layer(ELU)
ncnn_add_layer(Embed)
ncnn_add_layer(Exp)
ncnn_add_layer(Flatten)
ncnn_add_layer(InnerProduct)
ncnn_add_layer(Input)
ncnn_add_layer(Log)
ncnn_add_layer(LRN)
ncnn_add_layer(MemoryData)
ncnn_add_layer(MVN)
ncnn_add_layer(Pooling)
ncnn_add_layer(Power)
ncnn_add_layer(PReLU)
ncnn_add_layer(Proposal)
ncnn_add_layer(Reduction)
ncnn_add_layer(ReLU)
ncnn_add_layer(Reshape)
ncnn_add_layer(ROIPooling)
ncnn_add_layer(Scale)
ncnn_add_layer(Sigmoid)
ncnn_add_layer(Slice)
ncnn_add_layer(Softmax)
ncnn_add_layer(Split)
ncnn_add_layer(SPP OFF)
ncnn_add_layer(TanH)
ncnn_add_layer(Threshold)
ncnn_add_layer(Tile OFF)
ncnn_add_layer(RNN OFF)
ncnn_add_layer(LSTM OFF)
ncnn_add_layer(BinaryOp)
ncnn_add_layer(UnaryOp)
ncnn_add_layer(ConvolutionDepthWise)
ncnn_add_layer(Padding)
ncnn_add_layer(Squeeze)
ncnn_add_layer(ExpandDims)
ncnn_add_layer(Normalize)
ncnn_add_layer(Permute)
ncnn_add_layer(PriorBox)
ncnn_add_layer(DetectionOutput)
ncnn_add_layer(Interp)
ncnn_add_layer(DeconvolutionDepthWise)
ncnn_add_layer(ShuffleChannel)
ncnn_add_layer(InstanceNorm)
ncnn_add_layer(Clip)
ncnn_add_layer(Reorg)
ncnn_add_layer(YoloDetectionOutput)
ncnn_add_layer(Quantize)
ncnn_add_layer(Dequantize)
ncnn_add_layer(Yolov3DetectionOutput)
ncnn_add_layer(PSROIPooling)
ncnn_add_layer(ROIAlign OFF)
ncnn_add_layer(Packing)
ncnn_add_layer(Requantize)
ncnn_add_layer(Cast)

#add_custom_target(generate-spirv DEPENDS ${SHADER_SPV_HEX_FILES})


#if( (CMAKE_SYSTEM_PROCESSOR MATCHES "^(arm|aarch64)"))
#            set(arch arm)
#       else()
#            set(arch x86)
#        endif()


# Searches for a specified prebuilt library and stores the path as a
# variable. Because CMake includes system libraries in the search path by
# default, you only need to specify the name of the public NDK library
# you want to add. CMake verifies that the library exists before
# completing its build.

find_library( # Sets the name of the path variable.
              log-lib

              # Specifies the name of the NDK library that
              # you want CMake to locate.
              log )

# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

#target_link_libraries( # Specifies the target library.
#                       squeezencnn

                       # Links the target library to the log library
                       # included in the NDK.
#                       ${log-lib} )

target_link_libraries( #squeezencnn
                       #加入该依赖库
                        MobileNetssd   #和上面一样
                           #    ncnn_lib       #这个ncnn的lib的add
                       jnigraphics
                       ${log-lib} )